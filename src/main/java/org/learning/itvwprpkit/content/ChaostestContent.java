package org.learning.itvwprpkit.content;

import java.util.List;

public class ChaostestContent implements Content {

    private int testCount;
    private List<ChaosContent> contents;

    public int getTestCount() {
        return testCount;
    }

    public void setTestCount(int testCount) {
        this.testCount = testCount;
    }

    public List<ChaosContent> getContents() {
        return contents;
    }

    public void setContents(List<ChaosContent> contents) {
        this.contents = contents;
    }

}
