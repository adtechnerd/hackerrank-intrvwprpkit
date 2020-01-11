package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.ValleyCountingContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * File reading for Valley counting problem
 */
public class ValleyCountingFileReader implements FileReader<ValleyCountingContent> {

    @Override
    public ValleyCountingContent read(File file) {
        ValleyCountingContent content = new ValleyCountingContent();
        try (Scanner in = new Scanner(new FileInputStream(file))) {
            if (in.hasNext()) {
                content.setN(in.nextInt());
                content.setS(in.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
}
