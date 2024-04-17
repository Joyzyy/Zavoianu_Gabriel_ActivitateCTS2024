package clase;

public class Autobuz implements AutobuzAbstract {
    private int numarCalatori;
    private String numarAutobuz;
    private String numeSofer;

    public Autobuz(int numarCalatori, String numarAutobuz, String numeSofer) {
        this.numarCalatori = numarCalatori;
        this.numarAutobuz = numarAutobuz;
        this.numeSofer = numeSofer;
    }

    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul " + numarAutobuz + " condus de " + numeSofer + " a oprit in statia: " + statie);
    }

    @Override
    public String getNumarAutobuz() {
        return this.numarAutobuz;
    }

    @Override
    public int getNumarCalatori() {
        return numarCalatori;
    }

    public void setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
    }
}
