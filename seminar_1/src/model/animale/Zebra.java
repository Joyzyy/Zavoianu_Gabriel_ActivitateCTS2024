package model.animale;

public class Zebra extends Animal {

    public Zebra(String name, int age, int numarPicioare) {
        super(name, age, numarPicioare);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Zebra ");
        sb.append(this.getName());
        sb.append(" mancarea ");
        System.out.println(sb);
    }
}
