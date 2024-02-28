package readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    @Override
    public List<Aplicant> read(String file) {
        try {
            Scanner input = new Scanner(new File(file)).useDelimiter(",");
            List<Aplicant> angajati = new ArrayList<>();

            while (input.hasNext()) {
                Angajat angajat = new Angajat();
                super.readAplicant(input, angajat);
                int salariu = input.nextInt();
                String ocupatie = input.next();
                angajat.setSalariu(salariu);
                angajat.setOcupatie(ocupatie);
                angajati.add(angajat);
            }

            input.close();

            return angajati;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
