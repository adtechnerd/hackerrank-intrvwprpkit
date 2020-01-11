package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.CloudJumpContent;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class CloudJumpReaderTest {

    @Test
    public void jumpReader() {
        File file = new File("src/test/resources/cloudjump.txt");
        CloudJumpReader reader = new CloudJumpReader();
        CloudJumpContent cloudJump = reader.read(file);
        assertEquals(cloudJump.getCount(), 7);
        int[] cloudNum = cloudJump.getCloudNum();
        assertEquals(cloudNum.length, 7);
        assertEquals(cloudNum[2], 1);
    }
}
