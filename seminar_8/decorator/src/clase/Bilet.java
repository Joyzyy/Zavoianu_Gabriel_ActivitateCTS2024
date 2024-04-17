package clase;

public class Bilet implements BiletAbstract {
    private double pret;
    private String cod;

    public Bilet(double pret, String cod) {
        this.pret = pret;
        this.cod = cod;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return this.pret;
    }

    @Override
    public void printareBilet() {
        System.out.println("Pretul biletului cu codul " + cod + " este " + pret);
    }
}
