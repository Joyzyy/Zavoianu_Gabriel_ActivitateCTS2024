package factory_method.factories;

import factory_method.clase.Medicament;

public abstract class MedicamentFactories {
    public String denumire;
    public double pret;

    public MedicamentFactories(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public abstract Medicament factoryMethod();
}
