package org.codekart.cell;

import org.codekart.cell.Cell;

public class NormalCell extends Cell {
    private int position;

    @Override
    public int getNextPosition(int currentPosition) {
        return currentPosition;
    }
}
