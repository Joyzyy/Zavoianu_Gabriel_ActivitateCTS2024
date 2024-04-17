package decorator;

import clase.Bilet;
import clase.BiletAbstract;

public class BiletAniversare extends Decorator {
    public BiletAniversare(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        super.bilet.printareBilet();
        System.out.println("LA MULTI ANI!");
    }

    @Override
    public void reducerePret() {
        ((Bilet)super.bilet).setPret(0);
    }
}
