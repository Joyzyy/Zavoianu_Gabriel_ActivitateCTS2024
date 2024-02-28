import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import clase.Angajat;
import clase.Aplicant;
import readers.AngajatReader;
import readers.AplicantReader;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AplicantReader angajatReader = new AngajatReader();
        listaAngajati = angajatReader.read("angajati.txt");

        for (Aplicant angajat : listaAngajati) {
            System.out.println(angajat.toString());
        }
    }
}