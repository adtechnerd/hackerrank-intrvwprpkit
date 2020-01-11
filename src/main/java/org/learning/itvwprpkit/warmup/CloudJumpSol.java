package org.learning.itvwprpkit.warmup;

import org.learning.itvwprpkit.content.CloudJumpContent;
import org.learning.itvwprpkit.reader.CloudJumpReader;

import java.io.File;

public class CloudJumpSol {
    private static final String path = "src/main/resources/cloudjump.txt";

    public static void main(String[] args) {
        CloudJumpSol sol = new CloudJumpSol();
        File file = new File(path);
        CloudJumpContent content = sol.getInput(file);
        System.out.println(sol.cloudJump(content.getCount(), content.getCloudNum()));
    }

    private int cloudJump(int n, int[] clouds) {
        int count = 0;
        for (int i = 0; i + 1 < n; ) {
            if (i + 2 < n && clouds[i + 2] == 0) {
                i += 2;
                count++;
            } else if (clouds[i + 1] == 0) {
                i++;
                count++;
            }
        }
        return count;
    }

    private CloudJumpContent getInput(File file) {
        CloudJumpReader reader = new CloudJumpReader();
        return reader.read(file);
    }
}
