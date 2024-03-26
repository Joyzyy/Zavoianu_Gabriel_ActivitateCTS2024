package BuilderV2.main;

import BuilderV2.AbstractBuilder;
import BuilderV2.Rezervare;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new Rezervare.RezervareBuilder();
        Rezervare rezervare = builder.adaugaBautura().build();
        Rezervare rezervare1 = builder.adaugaMuzica().build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}
