package org.lecture;

/**
 * This class is a cat for creating cat instances
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat {
    private int age;
    private String name;
    private CatBreed catBreed;
    private double height;
    private double weight;
    private boolean jumped;

    public String meow() {
        System.out.println("Meow");
        return "Meow";
    }
    public String eat() {
        System.out.println("Cat eats.");
        return "Cat eats.";
    }
    public String sleep() {
        System.out.println("Cat sleeps.");
        return "Cat sleeps.";
    }
}