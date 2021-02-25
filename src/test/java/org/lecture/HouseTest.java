package org.lecture;

/**
 * ### HOUSE TEST ###
 *
 * Includes test cases for the class "House"
 *
 * @author: Michael Pfeiffer
 * @since: 25.02.2021
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseTest {

    @Test
    public void renovate() {
        House house = new House();
        Assertions.assertEquals("House will be renovated!",house.renovate());
    }
}
