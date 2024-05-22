package strategy;

public class PlatesteCardCalatori extends ModDePlata {
    private int numarCalatorii;

    public PlatesteCardCalatori(int numarCalatorii) {
        this.numarCalatorii = numarCalatorii;
    }

    @Override
    public void plateste(double pret) {
        if (this.numarCalatorii == 0) {
            super.succesor.plateste(pret);
            return;
        }

        if (super.succesor == null) {
            System.out.println("Amenda!");
            return;
        }

        System.out.println("S-a efectuat plata pentru calatoria in valoare de " + pret + " cu cardul de calatori!");
        this.numarCalatorii--;
    }

    @Override
    public String toString() {
        return "PlatesteCardCalatori{" +
                "numarCalatorii=" + numarCalatorii +
                ", succesor=" + succesor +
                '}';
    }
}
