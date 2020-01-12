package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.ArrayManipulation;
import org.learning.itvwprpkit.content.InstructionsArrManipulation;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class ArrayManipulationReaderTest {

    @Test
    public void arrayManipulationTest() {
        String path = "src/test/resources/arrmanipulation.txt";
        File file = new File(path);
        ArrayManipulationReader reader = new ArrayManipulationReader();
        ArrayManipulation manipulation = reader.read(file);
        assertEquals(manipulation.getN(), 5);
        assertEquals(manipulation.getInstCount(), 3);
        InstructionsArrManipulation[] instructions = manipulation.getInstructions();
        assertEquals(instructions.length, 3);
        assertEquals(instructions[0].getStart(), 1);
        assertEquals(instructions[0].getEnd(),2);
        assertEquals(instructions[2].getAdd(), 100);
    }
}
