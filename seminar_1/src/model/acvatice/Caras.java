package model.acvatice;

public class Caras extends Peste {

    public Caras(int nrInatatoare, String rasa) {
        super(nrInatatoare, rasa);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        sb.append("Carasul ").append(this.getRasa()).append(" mananca ").append(mancare);
        System.out.println(sb);
    }
}
