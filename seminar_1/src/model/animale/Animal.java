package model.animale;

import model.animale.Vietate;

public abstract class Animal implements Vietate {
    private String name;
    private int age;
    private int numarPicioare;

    public Animal(String name, int age, int numarPicioare) {
        this.name = name;
        this.age = age;
        this.numarPicioare = numarPicioare;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumarPicioare() {
        return numarPicioare;
    }

    public void setNumarPicioare(int numarPicioare) {
        this.numarPicioare = numarPicioare;
    }
}
