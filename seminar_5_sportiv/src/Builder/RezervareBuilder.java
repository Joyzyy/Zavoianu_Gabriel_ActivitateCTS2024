package Builder;

public class RezervareBuilder implements AbstractBuilder {
    private boolean isMancareInclusa = false;
    private boolean isScaunErgonomic = false;
    private boolean isBautura = false;
    private boolean isMuzica = false;
    private String genMuzical = "";

    public RezervareBuilder() {}

    public boolean isMancareInclusa() {
        return isMancareInclusa;
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        isMancareInclusa = mancareInclusa;
        return this;
    }

    public boolean isScaunErgonomic() {
        return isScaunErgonomic;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        isScaunErgonomic = scaunErgonomic;
        return this;
    }

    public boolean isBautura() {
        return isBautura;
    }

    public RezervareBuilder setBautura(boolean bautura) {
        isBautura = bautura;
        return this;
    }

    public boolean isMuzica() {
        return isMuzica;
    }

    public RezervareBuilder setMuzica(boolean muzica) {
        isMuzica = muzica;
        return this;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public RezervareBuilder setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }

    @Override
    public AbstractBuilder adaugaMancare() {
        this.isMancareInclusa = true;
        return this;
    }

    @Override
    public AbstractBuilder adaugaScaunErgonomic() {
        this.isScaunErgonomic = true;
        return this;
    }

    @Override
    public AbstractBuilder adaugaBautura() {
        this.isBautura = true;
        return this;
    }

    @Override
    public AbstractBuilder adaugaMuzica() {
        this.isMuzica = true;
        return this;
    }

    @Override
    public AbstractBuilder adaugaGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(isMancareInclusa, isScaunErgonomic, isBautura, isMuzica, genMuzical);
    }
}
