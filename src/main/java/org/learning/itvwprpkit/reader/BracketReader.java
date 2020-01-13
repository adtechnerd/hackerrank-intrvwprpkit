package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.BracketContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BracketReader implements FileReader<BracketContent> {
    @Override
    public BracketContent read(File file) {
        BracketContent content = new BracketContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int n = Integer.parseInt(scanner.nextLine());
            String[] arr = new String[n];
            content.setN(n);
            for (int i = 0; i < n; i++) {
                arr[i] =  scanner.nextLine();
            }
            content.setS(arr);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}
