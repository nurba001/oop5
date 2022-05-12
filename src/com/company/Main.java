package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animal = {new Shark(), new Eagle(), new Turtle()};

        for (Animal animal1 : animal) {

            if (animal1 instanceof Shark) {
                System.out.println(animal1.getClass());
                System.out.println(animal1.toString("Tom"));
                ((Shark)animal1).attack();
            }
            if (animal1 instanceof Eagle) {
                System.out.println(animal1.getClass());
                System.out.println(animal1.toString("Piter"));
                ((Eagle)animal1).fly();
            }
            if (animal1 instanceof Turtle) {
                System.out.println(animal1.getClass());
                System.out.println(animal1.toString("Nikolanjelo"));
                ((Turtle)animal1).animal();
                ((Turtle)animal1).swin();
            }
        }
    }
}