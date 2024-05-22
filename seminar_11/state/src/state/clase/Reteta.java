package state.clase;

public class Reteta {
    private int nrMedicamente;
    private double pret;
    private int nrReteta;
    private AbstractState state;

    public Reteta(int nrMedicamente, double pret, int nrReteta) {
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
        this.nrReteta = nrReteta;
        this.state = new StareEmisa();
    }

    // diferenta strategy si state e ca schimb state-ul in clasa, deci acesta tre sa fie protected
    protected void schimbaStare(AbstractState state) {
        this.state = state;
    }

    public void cerereMedicamente() {
        if (!(this.state instanceof StareEmisa)) {
            System.out.println("Nu puteti solicita medicamente in baza acestei retete");
            return;
        }
        System.out.println("Au fost solicitate " + this.nrMedicamente + " in baza retetei cu nr " + this.nrReteta);
        AbstractState solicitata = new StareSolicitata();
        solicitata.schimbaStare(this);
    }

    public void cumparareMedicamente() {
        if (!(this.state instanceof StareSolicitata)) {
            System.out.println("Nu puteti lua medicamente in baza acestei retete");
            return;
        }
        System.out.println("Au fost achizitionate medicamentele aferente retei cu nr " + this.nrReteta + " in valoare de " + this.pret);
        AbstractState achizionata = new StareAchizitionata();
        achizionata.schimbaStare(this);
    }

    public void respingeReteta() {
        if (!(this.state instanceof StareSolicitata)) {
            System.out.println("Reteta nu a fost solicitata!");
            return;
        }
        System.out.println("Nu avem aceste medicamente in stoc!");
        AbstractState emisa = new StareEmisa();
        emisa.schimbaStare(this);
    }
}
