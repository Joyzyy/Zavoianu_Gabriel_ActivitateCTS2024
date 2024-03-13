package factory;

import clase.*;
import enums.TipMedicament;

public class MedicamentFactory {
    public static Medicament crareMedicament(TipMedicament tipMedicament, String denumire, double pret, int... valabilitate) throws Exception {
        return switch (tipMedicament) {
            case BODY -> new Body(denumire, pret);
            case RACEALA -> new Raceala(denumire, pret, valabilitate[0]);
            case DURERE -> new Durere(denumire, pret);
            case GRIPA -> new Gripa(denumire, pret);
            default -> throw new Exception("Nu exista medicamentul!");
        };
    }
}
