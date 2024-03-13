package factory_method.main;

import factory.MedicamentFactory;
import factory_method.clase.Medicament;
import factory_method.factories.BodyFactory;
import factory_method.factories.GripaFactory;
import factory_method.factories.MedicamentFactories;

public class Main {
    public static void main(String[] args) {
        MedicamentFactories bodyFactory = new BodyFactory("bitch sit oon my face", 123123.23);
        MedicamentFactories gripaFactory = new GripaFactory("i attack that", 43534.43, 5);
        procesareMedicament(bodyFactory);
        procesareMedicament(gripaFactory);
    }

    public static void procesareMedicament(MedicamentFactories factory) {
        Medicament medicament = factory.factoryMethod();
        medicament.afisareDetalii();
    }
}