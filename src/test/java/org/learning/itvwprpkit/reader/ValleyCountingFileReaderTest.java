package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.ValleyCountingContent;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Test class for file reader for valley counting problem
 *
 */
public class ValleyCountingFileReaderTest {

    @Test
    public void readTest() {
        File file = new File("src/test/resources/valleycounting.txt");
        ValleyCountingFileReader reader = new ValleyCountingFileReader();
        ValleyCountingContent con = reader.read(file);
        assertEquals(con.getN(), 8);
        assertEquals(con.getS(), "UDDDUDUU");
    }
}
