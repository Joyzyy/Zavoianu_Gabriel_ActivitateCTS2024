package model.zoo;

import model.animale.Animal;
import model.animale.Vietate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private Map<Vietate, String> animals;

    public Zoo(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZooKeeper getZooKeeper() {
        return zooKeeper;
    }

    public void setZooKeeper(ZooKeeper zooKeeper) {
        this.zooKeeper = zooKeeper;
    }

    public Map<Vietate, String> getAnimals() {
        return animals;
    }

    public void setAnimals(Map<Vietate, String> animals) {
        this.animals = animals;
    }

    public void addAnimal(Vietate animal, String mancare) {
        if (this.animals == null) {
            this.animals = new HashMap<>();
        }
        this.animals.put(animal, mancare);
    }

    public void feedAllAnimals() {
        this.animals.forEach((k, v) -> {
            this.zooKeeper.feedAnimal(k, v);
        });
    }
}
