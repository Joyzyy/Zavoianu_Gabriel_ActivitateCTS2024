package clase;

public class Raceala extends Medicament {
    private int  valabilitate;
    public Raceala(String nume, double pret) {
        super(nume, pret);
        this.valabilitate = 0;
    }

    public Raceala(String nume, double pret, int valabilitate) {
        super(nume, pret);
        this.valabilitate = valabilitate;
    }

    public int getValabilitate() {
        return this.valabilitate;
    }

    @Override
    public void afisareDetalii() {
        System.out.println(super.getNume() + " costa " + super.getPret() + " si este bun pt raceala, valabilitate " + this.getValabilitate());
    }
}
