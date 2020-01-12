package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.ArrayManipulation;
import org.learning.itvwprpkit.content.InstructionsArrManipulation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayManipulationReader implements FileReader<ArrayManipulation> {
    @Override
    public ArrayManipulation read(File file) {
        ArrayManipulation manipulation = new ArrayManipulation();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            String constraint = scanner.nextLine();
            String[] constraints = constraint.split(" ");
            int n = Integer.parseInt(constraints[0]);
            int instCount = Integer.parseInt(constraints[1]);
            manipulation.setN(n);
            manipulation.setInstCount(instCount);
            InstructionsArrManipulation[] arrManipulations = new InstructionsArrManipulation[instCount];
            for (int i = 0; i < instCount; i++) {
                String instruction = scanner.nextLine();
                String[] splitInst = instruction.split(" ");
                int start = Integer.parseInt(splitInst[0]);
                int end = Integer.parseInt(splitInst[1]);
                int add = Integer.parseInt(splitInst[2]);
                InstructionsArrManipulation instructionsArrManipulation = new InstructionsArrManipulation();
                instructionsArrManipulation.setStart(start);
                instructionsArrManipulation.setEnd(end);
                instructionsArrManipulation.setAdd(add);
                arrManipulations[i] = instructionsArrManipulation;
            }
            manipulation.setInstructions(arrManipulations);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return manipulation;
    }
}
