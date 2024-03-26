package Builder;

public class RezervareBuilder implements AbstractBuilder {
    private boolean isMancareInclusa = false;
    private boolean isScaunErgonomic = false;
    private boolean isBautura = false;
    private boolean isMuzica = false;
    private String genMuzical = "";

    public RezervareBuilder() {}

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
