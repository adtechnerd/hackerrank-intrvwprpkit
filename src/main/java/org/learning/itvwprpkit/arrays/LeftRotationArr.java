package org.learning.itvwprpkit.arrays;

import org.learning.itvwprpkit.content.LeftRotationArrayContent;
import org.learning.itvwprpkit.reader.LeftRotationArrayReader;

import java.io.File;

public class LeftRotationArr {
    private static final String PATH = "src/main/resources/leftrotationarr.txt";

    public static void main(String[] args) {
        LeftRotationArr sol = new LeftRotationArr();
        File file = new File(PATH);
        LeftRotationArrayContent content = sol.readInput(file);
        sol.printArr(sol.leftRotate(content.getN(), content.getRn(), content.getArr()));
    }

    private void printArr(int[] leftRotate) {
        for (int i = 0; i < leftRotate.length; i++) {
            System.out.println(leftRotate[i]);
        }
    }

    private int[] leftRotate(int n, int rn, int[] arr) {
        int diff = rn % n;
        int[] diffArr = new int[diff];
        for (int i = 0; i < diff; i++) {
            diffArr[i] = arr[i];
        }
        for (int i = diff; i < n; i++) {
            arr[i-diff] = arr[i];
        }
        for (int i = 0; i < diff; i++) {
            arr[n - diff + i] = diffArr[i];
        }
        return arr;
    }

    private LeftRotationArrayContent readInput(File file) {
        LeftRotationArrayReader reader = new LeftRotationArrayReader();
        return reader.read(file);
    }


}
