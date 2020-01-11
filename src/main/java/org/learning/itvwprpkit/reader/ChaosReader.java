package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.ChaosContent;
import org.learning.itvwprpkit.content.ChaostestContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChaosReader implements FileReader<ChaostestContent> {
    @Override
    public ChaostestContent read(File file) {
        ChaostestContent content = new ChaostestContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int testCase = Integer.parseInt(scanner.next());
            content.setTestCount(testCase);
            List<ChaosContent> chaosContentList = new ArrayList<>();
            for (int i = 0; i < testCase; i++) {
                int n = Integer.parseInt(scanner.next());
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = Integer.parseInt(scanner.next());
                }
                ChaosContent chaosContent = new ChaosContent();
                chaosContent.setArr(arr);
                chaosContent.setN(n);
                chaosContentList.add(chaosContent);
            }
            content.setContents(chaosContentList);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}
