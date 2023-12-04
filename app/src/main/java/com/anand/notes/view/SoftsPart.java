package com.anand.notes.view;

public class SoftsPart {

    private int start;
    private int end;

    public SoftsPart(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean isValid() {
        return start < end;
    }
}
