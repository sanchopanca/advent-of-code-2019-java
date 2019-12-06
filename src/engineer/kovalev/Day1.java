package engineer.kovalev;

import java.util.List;

public class Day1 {
    public static int calculateFuelRequirement(int mass) {
        return (mass / 3) - 2;
    }

    public static int calculateFullFuelRequirement(int mass) {
        int result = 0;
        mass = calculateFuelRequirement(mass);
        while (mass > 0) {
            result += mass;
            mass = calculateFuelRequirement(mass);
        }
        return result;
    }

    public static int level1(List<Integer> masses) {
        return masses.stream().mapToInt(Day1::calculateFuelRequirement).sum();
    }

    public static int level2(List<Integer> masses) {
        return masses.stream().mapToInt(Day1::calculateFullFuelRequirement).sum();
    }
}
