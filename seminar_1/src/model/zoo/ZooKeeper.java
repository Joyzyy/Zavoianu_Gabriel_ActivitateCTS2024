package model.zoo;

import model.animale.Animal;
import model.animale.Vietate;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feedAnimal(Vietate animal, String mancare) {
        animal.eat(mancare);
    }
}
