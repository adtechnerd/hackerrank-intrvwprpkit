package org.learning.itvwprpkit.content;

public class ArrayManipulation implements Content {
    private int n;
    private int instCount;
    private InstructionsArrManipulation[] instructions;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getInstCount() {
        return instCount;
    }

    public void setInstCount(int instCount) {
        this.instCount = instCount;
    }

    public InstructionsArrManipulation[] getInstructions() {
        return instructions;
    }

    public void setInstructions(InstructionsArrManipulation[] instructions) {
        this.instructions = instructions;
    }
}
