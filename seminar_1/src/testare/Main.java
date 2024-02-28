package testare;

import model.acvatice.Caras;
import model.animale.Animal;
import model.animale.Lion;
import model.animale.Zebra;
import model.zoo.Zoo;
import model.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Lion leu_1 = new Lion("musafa", 30, 2);
        Zebra zebra_1 = new Zebra("zebra_1", 10, 4);
        Zoo zoo = new Zoo("Zoo", new ZooKeeper("Bucuresti"));
        zoo.addAnimal(leu_1, "carne");
        zoo.addAnimal(zebra_1, "fan");
        zoo.addAnimal(new Caras(4, "flowgod"), "bilute");
        zoo.feedAllAnimals();

        TipuriMancare carnivor = TipuriMancare.CARNIVOR;
    }

    public enum TipuriMancare {
        CARNIVOR,
        IERBIVOR,
        OMNIVOR,
    }
}