import clase.Durere;
import clase.Medicament;
import enums.TipMedicament;
import factory.MedicamentFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Medicament durere = MedicamentFactory.crareMedicament(TipMedicament.DURERE, "Paracetamol", 20.42);
        Medicament raceala = MedicamentFactory.crareMedicament(TipMedicament.RACEALA, "Tamtum Verde", 43.42, 2);
        Medicament body = MedicamentFactory.crareMedicament(TipMedicament.BODY, "Nivea", 10);

        durere.afisareDetalii();
        raceala.afisareDetalii();
        body.afisareDetalii();
    }
}