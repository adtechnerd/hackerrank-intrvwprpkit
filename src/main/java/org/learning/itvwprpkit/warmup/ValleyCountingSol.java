package org.learning.itvwprpkit.warmup;

import org.learning.itvwprpkit.content.ValleyCountingContent;
import org.learning.itvwprpkit.reader.ValleyCountingFileReader;

import java.io.File;
import java.util.Stack;

/**
 * Count number of valleys.
 */
public class ValleyCountingSol {

    private static final String FILE_PATH = "src/main/resources/valleycounting.txt";

    public static void main(String[] args) {
        ValleyCountingSol sol = new ValleyCountingSol();
        ValleyCountingContent content = sol.getInput(new File(FILE_PATH));
        System.out.println(sol.countValley(content));
    }

    /**
     * Logic to read number of valleys
     *
     * @param content
     * @return
     */
    private int countValley(ValleyCountingContent content) {
        int count = 0;
        int localSum = 0;
        int globalSum = 0;
        int n = content.getN();
        char[] str = content.getS().toCharArray();
        for(int j = 0; j < n; j++) {
            if(str[j] == 'U') {
                localSum += 1;
            } else {
                localSum -= 1;
            }
            if(localSum < 0 && localSum < globalSum) {
                globalSum = localSum;
            }
            if(localSum == 0 && globalSum < 0) {
                System.out.println("found valley");
                count ++;
                globalSum = 0;
            }
        }
        return count;
    }

    private ValleyCountingContent getInput(File file) {
        ValleyCountingFileReader reader = new ValleyCountingFileReader();
        return reader.read(file);
    }
}
