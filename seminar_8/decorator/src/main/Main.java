package main;

import clase.Bilet;
import decorator.BiletAniversare;
import decorator.BiletSarbatori;
import decorator.Decorator;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet(2.99, "STB-312");
        bilet.printareBilet();

        Decorator biletSarbatori = new BiletSarbatori(bilet);
        biletSarbatori.reducerePret();
        biletSarbatori.printareBilet();

        Decorator biletAniversare = new BiletAniversare(bilet);
        biletAniversare.reducerePret();
        biletAniversare.printareBilet();

        Decorator biletAniversareSTB = new BiletAniversare(biletSarbatori);
        biletAniversareSTB.printareBilet();
    }
}