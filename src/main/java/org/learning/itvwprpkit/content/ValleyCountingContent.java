package org.learning.itvwprpkit.content;

import java.util.Objects;

public class ValleyCountingContent implements Content {
    private int n;
    private String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValleyCountingContent that = (ValleyCountingContent) o;
        return n == that.n &&
                Objects.equals(s, that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, s);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
