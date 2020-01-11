package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.TwoDArrhgContent;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class TwoDarrhgReaderTest {

    @Test
    public void twoDArrReaderTest() {
        String path = "src/test/resources/twoDarrayhg.txt";
        File file = new File(path);
        TwoDArrhgReader reader = new TwoDArrhgReader();
        TwoDArrhgContent content = reader.read(file);
        int[][] arr = content.getArr();
        assertEquals(arr[0][0], 1);
        assertEquals(arr[0][1], 1);
        assertEquals(arr[1][1], 1);
        assertEquals(arr[1][0], 0);
        assertEquals(arr[4][4], 0);
    }
}
