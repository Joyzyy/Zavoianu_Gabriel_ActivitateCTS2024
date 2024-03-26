package Builder;

public class Rezervare {
    private final boolean isMancareInclusa;
    private final boolean isScaunErgonomic;
    private final boolean isBautura;
    private final boolean isMuzica;
    private final String genMuzical;

    protected Rezervare(boolean isMancareInclusa, boolean isScaunErgonomic, boolean isBautura, boolean isMuzica, String genMuzical) {
        this.isMancareInclusa = isMancareInclusa;
        this.isScaunErgonomic = isScaunErgonomic;
        this.isBautura = isBautura;
        this.isMuzica = isMuzica;
        this.genMuzical = genMuzical;
    }

    protected Rezervare() {
        this.isMancareInclusa = false;
        this.isScaunErgonomic = false;
        this.isBautura = false;
        this.isMuzica = false;
        this.genMuzical = "";
    }

    public boolean isMancareInclusa() {
        return isMancareInclusa;
    }

//    public void setMancareInclusa(boolean mancareInclusa) {
//        isMancareInclusa = mancareInclusa;
//    }

    public boolean isScaunErgonomic() {
        return isScaunErgonomic;
    }

//    public void setScaunErgonomic(boolean scaunErgonomic) {
//        isScaunErgonomic = scaunErgonomic;
//    }

    public boolean isBautura() {
        return isBautura;
    }

//    public void setBautura(boolean bautura) {
//        isBautura = bautura;
//    }

    public boolean isMuzica() {
        return isMuzica;
    }

//    public void setMuzica(boolean muzica) {
//        isMuzica = muzica;
//    }

    public String getGenMuzical() {
        return genMuzical;
    }

//    public void setGenMuzical(String genMuzical) {
//        this.genMuzical = genMuzical;
//    }

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
}
