package factory_method.clase;

public class Body  extends Medicament {
    public Body(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println(super.getNume() + " costa " + super.getPret() + " , si este bun pt corp");
    }
}
