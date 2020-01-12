package org.learning.itvwprpkit.arrays;

import org.learning.itvwprpkit.content.MinArrSwapSortContent;
import org.learning.itvwprpkit.reader.MinArrSwapSortReader;

import java.io.File;
import java.util.Map;

public class MinArrSwapSort {
    private static final String PATH = "src/main/resources/minArrSwapSort.txt";
    public static void main(String[] args) {
        MinArrSwapSort sol = new MinArrSwapSort();
        File file = new File(PATH);
        MinArrSwapSortContent content = sol.readInput(file);
        System.out.println(sol.minSwapCount(content.getN(), content.getArr()));
    }

    private int minSwapCount(int n, int[] arr) {
        int count = 0;
        // TODO: add more logic here
        if(!isSort(n, arr)) {

        }
        return count;
    }

    private static boolean isSort(int n, int[] arr) {
        for (int i = 0; i + 1 < n; i++) {
            if(arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    private MinArrSwapSortContent readInput(File file) {
        MinArrSwapSortReader reader = new MinArrSwapSortReader();
        return reader.read(file);
    }
}
