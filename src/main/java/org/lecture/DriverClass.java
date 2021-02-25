package org.lecture;

public class DriverClass {

	/**
	 * ### DRIVER METHOD ###
	 *
	 * Creates objects of Cat, HeatingAppliance and House classes and executes methods
	 *
	 * @author: Michael Pfeiffer
	 * @since: 25.02.2021
	 */
    public static void main(String[] args) {

    	Cat luna = new Cat();
    	luna.setAge(15);
    	luna.setName("Luna");
    	luna.setCatBreed(CatBreed.AMERICAN_SHORTHAIR);
    	luna.setHeight(50);
    	luna.setWeight(20);
    	luna.setJumped(true);

    	House bungalow = new House();
    	bungalow.setAge(5);
    	bungalow.setPlace("Vienna");
    	bungalow.setContinent(Continent.EUROPE);
    	bungalow.setNrOfRooms(3);
    	bungalow.setInhabited(true);

    	HeatingAppliance flexoTherm = new HeatingAppliance();
    	flexoTherm.setName("flexoTherm");
    	flexoTherm.setFueling(Fueling.HEATPUMP);
    	flexoTherm.setSquaremtrs(80);
    	flexoTherm.setWeight(35);
    	flexoTherm.setState(true);

    	luna.meow();
    	luna.eat();
    	luna.sleep();
		bungalow.renovate();
		bungalow.clean();
    	bungalow.destroy();
    	flexoTherm.increaseWarmth();
		flexoTherm.decreaseWarmth();
		flexoTherm.checkStatus();

    }
}