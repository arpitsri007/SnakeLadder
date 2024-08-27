package org.codekart;

import org.codekart.cell.Cell;
import org.codekart.cell.LadderCell;
import org.codekart.cell.NormalCell;
import org.codekart.cell.SnakeCell;

public class Board {
    private int size;
    private Cell[] cells;

    public Board(int size) {
        this.size = size;
        this.cells = new Cell[size];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            cells[i] = new NormalCell();
        }
    }

    public void addLadder(int start, int end) {
        cells[start] = new LadderCell(end);
    }

    public void addSnake(int head, int tail) {
        cells[head] = new SnakeCell(tail);
    }

    public int movePlayer(int currentPostition, int diceValue) {
        int newPosition = currentPostition + diceValue;
        if (newPosition >= size) {
            return currentPostition;
        }
        return cells[newPosition].getNextPosition(newPosition);
    }



    public int getSize() {
        return size;
    }
}
