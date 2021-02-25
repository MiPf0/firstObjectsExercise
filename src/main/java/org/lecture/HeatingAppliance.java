package org.lecture;

/**
 * This class is a heating appliance for creating heating appliance instances
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeatingAppliance {
    private String name;
    private Fueling fueling;
    private double squaremtrs;
    private double weight;
    private boolean state;

    public void increaseWarmth() {
        System.out.println("It's gettin' hot in here");
    }
    public void decreaseWarmth() {
        System.out.println("Ice Ice Baby");
    }
    public void checkStatus() {
        System.out.println("Your heating appliance is OK");
    }
}