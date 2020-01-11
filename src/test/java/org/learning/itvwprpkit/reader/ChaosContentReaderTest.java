package org.learning.itvwprpkit.reader;

import org.junit.Test;
import org.learning.itvwprpkit.content.ChaosContent;
import org.learning.itvwprpkit.content.ChaostestContent;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChaosContentReaderTest {

    @Test
    public void chaosContentTest() {
        String path = "src/test/resources/chaos.txt";
        File file = new File(path);
        ChaosReader reader = new ChaosReader();
        ChaostestContent chaostestContent = reader.read(file);
        assertEquals(chaostestContent.getTestCount(), 2);
        List<ChaosContent> chaosContentList = chaostestContent.getContents();
        assertEquals(chaosContentList.size(), 2);
        int[] arr1 = chaosContentList.get(0).getArr();
        assertEquals(arr1.length, 5);
        assertEquals(arr1[0], 2);
        assertEquals(arr1[1], 1);
        int[] arr2 = chaosContentList.get(1).getArr();
        assertEquals(arr2.length, 5);
        assertEquals(arr2[1], 5);

    }
}
