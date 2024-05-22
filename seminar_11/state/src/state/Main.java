package state;

import state.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(10, 500, 1);
        reteta.cerereMedicamente();
        reteta.respingeReteta();
        reteta.cerereMedicamente();
        reteta.cumparareMedicamente();
    }
}