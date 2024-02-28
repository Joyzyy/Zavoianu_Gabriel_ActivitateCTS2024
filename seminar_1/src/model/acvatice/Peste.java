package model.acvatice;

import model.animale.Vietate;

public abstract class Peste implements Vietate {
    private int nrInatatoare;
    private String rasa;

    public Peste(int nrInatatoare, String rasa) {
        this.nrInatatoare = nrInatatoare;
        this.rasa = rasa;
    }

    public int getNrInatatoare() {
        return nrInatatoare;
    }

    public void setNrInatatoare(int nrInatatoare) {
        this.nrInatatoare = nrInatatoare;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
}
