package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.TwoDArrhgContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwoDArrhgReader implements FileReader<TwoDArrhgContent> {
    @Override
    public TwoDArrhgContent read(File file) {
        int[][] arr = new int[6][6];
        TwoDArrhgContent content = new TwoDArrhgContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int i = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] element = line.split(" ");
                for (int j = 0; j < 6; j++){
                    arr[i][j] = Integer.parseInt(element[j]);
                }
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        content.setArr(arr);
        return content;
    }
}
