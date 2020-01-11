package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.RepeatedStringContent;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class RepeatedStringReaderTest {

    @Test
    public void inputTest() {
        String path = "src/test/resources/repeatedstring.txt";
        File file = new File(path);
        RepeatedStringReader reader = new RepeatedStringReader();
        RepeatedStringContent content = reader.read(file);
        assertEquals(content.getS(), "ababa");
        assertEquals(content.getN().longValue(), 10l);
    }
}
