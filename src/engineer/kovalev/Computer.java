package engineer.kovalev;

import java.util.Arrays;

public class Computer {

    private static final int ADD = 1;
    private static final int MUL = 2;
    private static final int HALT = 99;


    public int[] getMemory() {
        return memory;
    }

    private int[] memory;
    private int p = 0;

    public Computer(int[] memory) {
        this.memory = Arrays.copyOf(memory, memory.length);
    }

    private void patch(int noun, int verb) {
        memory[1] = noun;
        memory[2] = verb;
    }
    private void add() {
        memory[memory[p+3]] = memory[memory[p+1]] + memory[memory[p+2]];
    }

    private void mul() {
        memory[memory[p+3]] = memory[memory[p+1]] * memory[memory[p+2]];
    }

    private void advance() {
        p += 4;
    }

    public void execute() {
        while (memory[p] != HALT) {
            if (memory[p] == ADD) {
                add();
            } else if (memory[p] == MUL) {
                mul();
            } else {
                throw new RuntimeException("Unknown operation");
            }
            advance();
        }
    }

    public int first() {
        return memory[0];
    }

    public int day2level1() {
        patch(12, 2);
        execute();
        return first();
    }

    public static int day2level2(int [] memory, int expected) {
        for (int noun = 0; noun < 100; noun++) {
            for (int verb = 0; verb < 100; verb++) {
                Computer c = new Computer(memory);
                c.patch(noun, verb);
                c.execute();
                if (c.first() == expected) {
                    return noun * 100 + verb;
                }
            }
        }
        throw new RuntimeException("No result found");
    }

}
