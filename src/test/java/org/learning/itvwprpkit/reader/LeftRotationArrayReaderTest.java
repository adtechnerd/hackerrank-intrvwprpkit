package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.LeftRotationArrayContent;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class LeftRotationArrayReaderTest {

    @Test
    public void rotationReaderTest() {
        String path = "src/test/resources/leftrotationarr.txt";
        File file = new File(path);
        LeftRotationArrayReader reader = new LeftRotationArrayReader();
        LeftRotationArrayContent content = reader.read(file);
        assertEquals(content.getN(), 5);
        assertEquals(content.getRn(), 4);
        int[] arr = content.getArr();
        int arLen = arr.length;
        assertEquals(arLen, 5);
        assertEquals(arr[0], 1);
        assertEquals(arr[4], 5);
    }
}
