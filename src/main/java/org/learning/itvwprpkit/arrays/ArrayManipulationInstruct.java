package org.learning.itvwprpkit.arrays;

import org.learning.itvwprpkit.content.ArrayManipulation;
import org.learning.itvwprpkit.content.InstructionsArrManipulation;
import org.learning.itvwprpkit.reader.ArrayManipulationReader;

import java.io.File;

public class ArrayManipulationInstruct {
    private static final String PATH = "src/main/resources/arrmanipulation.txt";
    public static void main(String[] args) {
        File file = new File(PATH);
        ArrayManipulationInstruct sol = new ArrayManipulationInstruct();
        ArrayManipulation manipulation = sol.readInput(file);
        System.out.println(sol.processInput(manipulation));
    }

    private long processInput(ArrayManipulation manipulation) {
        int max = 0;
        int size = manipulation.getN();
        long[] arr = new long[size];
        initialize(size, arr);
        InstructionsArrManipulation[] instructions = manipulation.getInstructions();
        int instCount = manipulation.getInstCount();
        for (int i = 0; i < instCount; i++) {
            int start = instructions[i].getStart();
            int end = instructions[i].getEnd();
            int adder = instructions[i].getAdd();
            for (int j = start -1 ; j < end ; j++) {
                arr[j] = arr[j] + adder;
            }
        }
        return getMax(arr);
    }

    private long getMax(long[] arr) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void initialize(int size, long[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    private ArrayManipulation readInput(File file) {
        ArrayManipulationReader reader = new ArrayManipulationReader();
        return reader.read(file);
    }
}
