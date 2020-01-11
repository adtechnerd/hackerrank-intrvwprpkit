package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.RepeatedStringContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RepeatedStringReader implements FileReader<RepeatedStringContent> {
    @Override
    public RepeatedStringContent read(File file) {
        RepeatedStringContent content = new RepeatedStringContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            String s = scanner.next();
            Long n = scanner.nextLong();
            content.setN(n);
            content.setS(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}
