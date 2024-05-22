package strategy;

public class PlatesteCardBancar extends ModDePlata {
    private int soldCard;

    public PlatesteCardBancar(int soldCard) {
        this.soldCard = soldCard;
    }

    @Override
    public void plateste(double pret) {
        if (soldCard < pret) {
            super.succesor.plateste(pret);
            return;
        }
        System.out.println("S-a efectuat plata pentru calatoria in valoare de " + pret + " cu cardul bancar!");
        this.soldCard -= pret;
    }

    @Override
    public String toString() {
        return "PlatesteCardBancar{" +
                "soldCard=" + soldCard +
                ", succesor=" + succesor +
                '}';
    }
}
