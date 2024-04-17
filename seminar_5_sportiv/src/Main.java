import Builder.Rezervare;
import Builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.adaugaMancare().build();
        Rezervare rezervare1 = rezervareBuilder.build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}