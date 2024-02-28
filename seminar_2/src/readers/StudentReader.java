package readers;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    @Override
    public List<Aplicant> read(String file) {
        try {
            Scanner input = new Scanner(new File(file)).useDelimiter(",|\n");
            List<Aplicant> studenti = new ArrayList<>();

            while (input.hasNext()) {
                Student student = new Student();
                super.readAplicant(input, student);
                int an_studii = input.nextInt();
                String facultate = (input.next()).toString();
                student.setAn_studii(an_studii);
                student.setFacultate(facultate);
                studenti.add(student);
            }

            input.close();
            return studenti;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
