package org.lecture;

/**
 * This class is a house for creating house instances
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House {
    private int age;
    private String place;
    private Continent continent;
    private int nrOfRooms;
    private boolean inhabited;

    public String renovate() {
        System.out.println("House will be renovated!");
        return "House will be renovated!";
    }
    public void clean() {
        System.out.println("House will be cleaned!");
    }
    public void destroy() {
        System.out.println("House will be destroyed!");
    }
}