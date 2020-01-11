package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.CloudJump;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class CloudJumpReaderTest {

    @Test
    public void jumpReader() {
        File file = new File("src/test/resources/cloudjump.txt");
        CloudJumpReader reader = new CloudJumpReader();
        CloudJump cloudJump = reader.read(file);
        assertEquals(cloudJump.getCount(), 7);
    }
}
