package model.animale;

public class Lion extends Animal {

    public Lion(String name, int age, int numarPicioare) {
        super(name, age, numarPicioare);
    }

    @Override
    public void eat(String mancare) {
            var sb = new StringBuilder();
            sb.append("Leul ");
            sb.append(this.getName());
            sb.append(" mancarea ");
            System.out.println(sb);
    }
}
