package org.codekart.cell;

public class LadderCell extends Cell {
    private int top;

    public LadderCell(int top) {
        this.top = top;
    }

    @Override
    public int getNextPosition(int currentPosition) {
        return top;
    }
}
