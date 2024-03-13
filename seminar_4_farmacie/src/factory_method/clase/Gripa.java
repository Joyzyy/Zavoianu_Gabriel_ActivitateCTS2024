package factory_method.clase;

public class Gripa extends Medicament {
    public int valabilitate;
    public Gripa(String nume, double pret, int valabilitate) {
        super(nume, pret);
        this.valabilitate = valabilitate;
    }

    @Override
    public void afisareDetalii() {
        System.out.println(super.getNume() + " costa " + super.getPret() + " si este bun pt gripa, valabilitate: " + this.valabilitate);
    }
}
