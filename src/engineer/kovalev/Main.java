package engineer.kovalev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        System.out.println(Day1.day2level1(integersFromStdin()));
//        System.out.println(Day1.level2(integersFromStdin()));
//        System.out.println(new Computer(intArrayFromCSV(lineFromStdin())).day2level1());
        System.out.println(Computer.day2level2(intArrayFromCSV(lineFromStdin()), 19690720));
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

    private static String lineFromStdin() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static int[] intArrayFromCSV(String input) {
        return Arrays.stream(input.split(",")).mapToInt(Integer::parseInt).toArray();
    }

}
