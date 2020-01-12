package org.learning.itvwprpkit.arrays;

import org.learning.itvwprpkit.content.ChaosContent;
import org.learning.itvwprpkit.content.ChaostestContent;
import org.learning.itvwprpkit.reader.ChaosReader;

import java.io.File;
import java.util.List;

public class NewYearChaos {
    private static final String PATH = "src/main/resources/chaos.txt";

    public static void main(String[] args) {
        NewYearChaos newYearChaos = new NewYearChaos();
        File file = new File(PATH);
        ChaostestContent chaostestContent = newYearChaos.readInput(file);
        List<ChaosContent> contents = chaostestContent.getContents();
        int testCount = chaostestContent.getTestCount();
        for (int i = 0; i < testCount; i++) {
            ChaosContent chaosContent = contents.get(i);
            int[] arr = chaosContent.getArr();
            int n = chaosContent.getN();
            int count = newYearChaos.getBriberyCount(n, arr);
            if (count == -1) {
                System.out.println("Too chaotic");
            } else {
                System.out.println(count);
            }
        }
    }

    private int getBriberyCount(int n, int[] arr) {
        int bribeCount = 0;
        for (int i = 0; i < n; i++) {
            int bribe = arr[i] - (i + 1);
            if (bribe > 2) {
                bribeCount = -1;
                break;
            } else {
                int pos = arr[i] -3 > 0 ? arr[i] -3 : -1;
                for(int j = i; j > pos; j--) {
                    if(arr[i] < arr[j] ) {
                        bribeCount ++;
                    }
                }
            }
        }
        return bribeCount;
    }


    private ChaostestContent readInput(File file) {
        ChaosReader reader = new ChaosReader();
        return reader.read(file);
    }
}
