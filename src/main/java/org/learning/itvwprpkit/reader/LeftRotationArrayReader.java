package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.LeftRotationArrayContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeftRotationArrayReader implements FileReader<LeftRotationArrayContent>{
    @Override
    public LeftRotationArrayContent read(File file) {
        LeftRotationArrayContent content = new LeftRotationArrayContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int n = scanner.nextInt();
            int rn = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            scanner.close();
            content.setN(n);
            content.setRn(rn);
            content.setArr(arr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}
