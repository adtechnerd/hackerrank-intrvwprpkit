package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.MinArrSwapSortContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MinArrSwapSortReader implements FileReader<MinArrSwapSortContent> {
    @Override
    public MinArrSwapSortContent read(File file) {
        MinArrSwapSortContent content = new MinArrSwapSortContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            content.setArr(arr);
            content.setN(n);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}
