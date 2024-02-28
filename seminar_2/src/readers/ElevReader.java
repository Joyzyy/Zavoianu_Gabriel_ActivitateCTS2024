package readers;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    @Override
    public List<Aplicant> read(String file) {
        try {
            Scanner input = new Scanner(new File(file));
            input.useDelimiter(",|\n");
            List<Aplicant> elevi = new ArrayList<>();

            while (input.hasNext()) {
                Elev elev = new Elev();
                super.readAplicant(input, elev);
                int clasa = input.nextInt();
                String tutore = input.next();
                elev.setClasa(clasa);
                elev.setTutore(tutore);
                elevi.add(elev);
            }

            input.close();
            return elevi;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
