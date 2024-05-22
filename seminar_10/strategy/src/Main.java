import clase.Validator;
import strategy.ModDePlata;
import strategy.PlatesteCardBancar;
import strategy.PlatesteCardCalatori;
import strategy.PlatesteSMS;

public class Main {
    public static void main(String[] args) {
        ModDePlata plataBancara = new PlatesteCardBancar(50);
        ModDePlata plataCalatorii = new PlatesteCardCalatori(0);
        ModDePlata plataSMS = new PlatesteSMS(100);
        Validator validator = new Validator(23, plataBancara, plataCalatorii, plataSMS);
        validator.setMetodaPlata(plataBancara);
        validator.valideazaCalatorie(111);
    }
}