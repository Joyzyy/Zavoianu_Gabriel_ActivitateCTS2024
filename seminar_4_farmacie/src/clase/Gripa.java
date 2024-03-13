package clase;

public class Gripa extends Medicament {

    public Gripa(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(super.getNume() + " costa " + super.getPret() + " si este bun pt gripa!");
    }
}
