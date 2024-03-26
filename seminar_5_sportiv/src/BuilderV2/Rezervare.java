package BuilderV2;

public class Rezervare {
    private boolean isMancareInclusa;
    private boolean isScaunErgonomic;
    private boolean isBautura;
    private boolean isMuzica;
    private String genMuzical;

    public Rezervare(boolean isMancareInclusa, boolean isScaunErgonomic, boolean isBautura, boolean isMuzica, String genMuzical) {
        this.isMancareInclusa = isMancareInclusa;
        this.isScaunErgonomic = isScaunErgonomic;
        this.isBautura = isBautura;
        this.isMuzica = isMuzica;
        this.genMuzical = genMuzical;
    }

    public Rezervare() {
        this.isMancareInclusa = false;
        this.isScaunErgonomic = false;
        this.isBautura = false;
        this.isMuzica = false;
        this.genMuzical = "";
    }

    public boolean isMancareInclusa() {
        return isMancareInclusa;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        isMancareInclusa = mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return isScaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        isScaunErgonomic = scaunErgonomic;
    }

    public boolean isBautura() {
        return isBautura;
    }

    public void setBautura(boolean bautura) {
        isBautura = bautura;
    }

    public boolean isMuzica() {
        return isMuzica;
    }

    public void setMuzica(boolean muzica) {
        isMuzica = muzica;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public RezervareBuilder builder() {
        return new RezervareBuilder();
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "isMancareInclusa=" + isMancareInclusa +
                ", isScaunErgonomic=" + isScaunErgonomic +
                ", isBautura=" + isBautura +
                ", isMuzica=" + isMuzica +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }

    public static class RezervareBuilder implements AbstractBuilder {
        private boolean isMancareInclusa;
        private boolean isScaunErgonomic;
        private boolean isBautura;
        private boolean isMuzica;
        private String genMuzical;

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
}
