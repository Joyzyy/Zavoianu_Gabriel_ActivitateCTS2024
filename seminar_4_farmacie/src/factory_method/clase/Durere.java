package factory_method.clase;

public class Durere extends Medicament {
    public Durere(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(super.getNume() + " costa " + super.getPret() + " si este bun pt raceala!");
    }
}
