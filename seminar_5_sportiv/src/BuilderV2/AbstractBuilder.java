package Builder;

public interface AbstractBuilder {
    AbstractBuilder adaugaMancare();
    AbstractBuilder adaugaScaunErgonomic();
    AbstractBuilder adaugaBautura();
    AbstractBuilder adaugaMuzica();
    AbstractBuilder adaugaGenMuzical(String genMuzical);
    Rezervare build();
}
