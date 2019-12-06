package engineer.kovalev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Day1.level1(integersFromStdin()));
        System.out.println(Day1.level2(integersFromStdin()));
    }

    private static List<Integer> integersFromStdin() {
        ArrayList<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                result.add(scanner.nextInt());
            }
        }
        return result;
    }
}
