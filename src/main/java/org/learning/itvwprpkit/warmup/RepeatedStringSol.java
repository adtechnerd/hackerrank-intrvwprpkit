package org.learning.itvwprpkit.warmup;

import org.learning.itvwprpkit.content.RepeatedStringContent;
import org.learning.itvwprpkit.reader.RepeatedStringReader;

import java.io.File;

public class RepeatedStringSol {
    private static final String path = "src/main/resources/repeatedstring.txt";

    public static void main(String[] args) {
        RepeatedStringSol sol = new RepeatedStringSol();
        File file = new File(path);
        RepeatedStringContent content = sol.getInput(file);
        System.out.println(sol.countA(content.getS(), content.getN()));
    }

    private long countA(String s, long len) {
        int aCount = 0;
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if(ch == 'a') {
                aCount ++;
            }
        }
        long div = len / (s.length());
        long count = div * aCount;
        long remaining = len % (s.length());
        for(int i = 0; i < remaining; i++) {
            if(arr[i] == 'a') {
                count ++;
            }
        }
        return count;
    }

    private RepeatedStringContent getInput(File file) {
        RepeatedStringReader reader = new RepeatedStringReader();
        return reader.read(file);
    }
}
