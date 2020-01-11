package org.learning.itvwprpkit.arrays;

import org.learning.itvwprpkit.content.TwoDArrhgContent;
import org.learning.itvwprpkit.reader.TwoDArrhgReader;

import java.io.File;

public class TwoDArrayHgMax {
    private static final String PATH = "src/main/resources/twoDarrayhg.txt";

    public static void main(String[] args) {
        TwoDArrayHgMax hgMax = new TwoDArrayHgMax();
        File file = new File(PATH);
        TwoDArrhgContent content = hgMax.input(file);
        System.out.println(hgMax.findHgMax(content.getArr()));
    }

    private int findHgMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int size = arr.length;
        for(int i = 1; i < size -1; i++) {
            for(int j = 1; j < size -1; j++) {
                int sum = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j-1] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    private TwoDArrhgContent input(File file) {
        TwoDArrhgReader reader = new TwoDArrhgReader();
        return reader.read(file);
    }
}
