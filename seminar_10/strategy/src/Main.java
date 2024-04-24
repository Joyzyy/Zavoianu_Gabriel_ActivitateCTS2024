import clase.Validator;
import strategy.ModDePlata;
import strategy.PlatesteCardBancar;
import strategy.PlatesteSMS;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(23);
        ModDePlata plataBancara = new PlatesteCardBancar();
        validator.setMetodaPlata(plataBancara);
        validator.valideazaCalatorie(25.5);
        ModDePlata plataSMS = new PlatesteSMS();
        validator.setMetodaPlata(plataSMS);
        validator.valideazaCalatorie(10);
    }
}