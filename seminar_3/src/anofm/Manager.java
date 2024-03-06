package anofm;

public class Manager {
    private String numeFirma;
    private String numeManager;
    private double salariu;

    protected Manager(String numeFirma, String numeManager, double salariu) {
        this.numeFirma = numeFirma;
        this.numeManager = numeManager;
        this.salariu = salariu;
    }

    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public String getNumeManager() {
        return numeManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "numeFirma='" + numeFirma + '\'' +
                ", numeManager='" + numeManager + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
