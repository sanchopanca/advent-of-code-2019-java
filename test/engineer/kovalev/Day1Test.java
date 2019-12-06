package engineer.kovalev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @Test
    void calculateFuelRequirementTest() {
        assertEquals(2, Day1.calculateFuelRequirement(12));
        assertEquals(2, Day1.calculateFuelRequirement(14));
        assertEquals(654, Day1.calculateFuelRequirement(1969));
        assertEquals(33583, Day1.calculateFuelRequirement(100756));
    }

    @Test
    void calculateFullFuelRequirement() {
        assertEquals(2, Day1.calculateFullFuelRequirement(14));
        assertEquals(966, Day1.calculateFullFuelRequirement(1969));
        assertEquals(50346, Day1.calculateFullFuelRequirement(100756));
    }
}