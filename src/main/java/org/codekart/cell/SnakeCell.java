package org.codekart.cell;

public class SnakeCell extends Cell {
    private int tail;

    public SnakeCell(int tail) {
        this.tail = tail;
    }

    @Override
    public int getNextPosition(int currentPosition) {
        return tail;
    }
}
