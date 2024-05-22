package template.clase;

public class AchizitieMedicamentPeBazaDeReteta extends Template {
    private String numeMedicament;

    public AchizitieMedicamentPeBazaDeReteta(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    protected void primireReteta() {
        System.out.println("Am primit reteta pentru medicamentul " + this.numeMedicament);
    }

    @Override
    protected boolean verificareStoc() {
        return super.getStocuriMap().containsKey(this.numeMedicament);
    }

    @Override
    protected void incaseaza() {
        System.out.println("Am incasat banii pentru medicamnetul x");
    }

    @Override
    protected void aduceMedicamente() {
        if (super.getStocuriMap().get(this.numeMedicament) > 1) {
            super.getStocuriMap().replace(this.numeMedicament, super.getStocuriMap().get(this.numeMedicament) - 1);
        } else {
            super.getStocuriMap().remove(this.numeMedicament);
        }
        System.out.println("Se aduce medicamentul aferent retetei!");
    }

    @Override
    protected void emiteBon() {
        System.out.println("Se emite bonul in valoare de x lei.");
    }

    @Override
    protected void respingeAchizitia() {
        System.out.println("Nu se poate continua cu achizitia medicamentului!");
    }
}
