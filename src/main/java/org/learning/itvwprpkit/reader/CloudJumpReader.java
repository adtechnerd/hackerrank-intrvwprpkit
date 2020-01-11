package org.learning.itvwprpkit.reader;

import org.learning.itvwprpkit.content.CloudJump;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CloudJumpReader implements FileReader<CloudJump> {
    @Override
    public CloudJump read(File file) {
        CloudJump cloudJump = new CloudJump();
        try {
            Scanner scanner = new Scanner(new FileInputStream(file));
            cloudJump.setCount(scanner.nextInt());
            String[] clouds = scanner.next().split(" ");
            int size = clouds.length;
            int[] cloudInt = new int[size];
            for (int i = 0; i < size; i++) {
                cloudInt[i] = Integer.parseInt(clouds[i]);
            }
            cloudJump.setCloudNum(cloudInt);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cloudJump;
    }
}
