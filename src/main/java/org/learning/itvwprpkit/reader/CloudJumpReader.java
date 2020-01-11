package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.CloudJumpContent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CloudJumpReader implements FileReader<CloudJumpContent> {


    @Override
    public CloudJumpContent read(File file) {
        CloudJumpContent cloudJump = new CloudJumpContent();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            int sizeInput = scanner.nextInt();
            int[] cloudInt = new int[sizeInput];
            for (int i = 0; i < sizeInput; i++) {
                cloudInt[i] = Integer.parseInt(scanner.next());
            }
            cloudJump.setCount(sizeInput);
            cloudJump.setCloudNum(cloudInt);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cloudJump;
    }
}
