import Builder.Rezervare;
import Builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.adaugaMancare().adaugaBautura().adaugaMuzica().adaugaGenMuzical("flask").build();
        Rezervare rezervare1 = rezervareBuilder.adaugaMuzica().adaugaGenMuzical("alt gen").build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}