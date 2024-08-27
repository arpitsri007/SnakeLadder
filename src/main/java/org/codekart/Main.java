package org.codekart;

import org.codekart.models.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(100);
        Dice dice = new Dice(6);
        List<Player> players = List.of(new Player("Alice"), new Player("Bob"));

        Game game = new Game(board, dice, players);
        while (true) {
            game.start();
            if (game.isOver()) {
                break;
            }
        }
    }
}