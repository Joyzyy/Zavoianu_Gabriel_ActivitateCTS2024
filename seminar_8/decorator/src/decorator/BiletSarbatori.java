package decorator;

import clase.Bilet;
import clase.BiletAbstract;

public class BiletSarbatori extends Decorator {
    public static int discount = 20;

    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        super.bilet.printareBilet();
        System.out.println("SARBATORI FERICITE!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)super.bilet).setPret(((Bilet) super.bilet).getPret() - (double)discount / 100 * ((Bilet) super.bilet).getPret());
    }
}
