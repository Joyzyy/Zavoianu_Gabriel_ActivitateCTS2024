package strategy;

public class PlatesteSMS extends ModDePlata {
    private double credit;

    public PlatesteSMS(double credit) {
        this.credit = credit;
    }

    @Override
    public void plateste(double pret) {
        if (credit < pret) {
            System.out.println("Amenda de la controlor...");
            return;
        }
        System.out.println("S-a efectuat plata pentru calatoria in valoare de " + pret + " cu SMS!");
        this.credit -= pret;
    }

    @Override
    public String toString() {
        return "PlatesteSMS{" +
                "credit=" + credit +
                ", succesor=" + succesor +
                '}';
    }
}
