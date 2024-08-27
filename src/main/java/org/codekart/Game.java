package org.codekart;

import org.codekart.models.Player;

import java.util.List;

public class Game {
    private Board board;
    private Dice dice;
    private List<Player> players;
    private int currentPlayerIndex;

    public Game(Board board, Dice dice, List<Player> players) {
        this.board = board;
        this.dice = dice;
        this.players = players;
        this.currentPlayerIndex = 0;
        this.board.addLadder(2, 15);
        this.board.addLadder(5, 7);
        this.board.addSnake(10, 3);
    }

    public void start() {
        Player currentPlayer = players.get(currentPlayerIndex);
        int diceValue = dice.roll();
        int newPosition = board.movePlayer(currentPlayer.getPosition(), diceValue);
        currentPlayer.setPosition(newPosition);
        System.out.println(currentPlayer.getName() + " rolled a " + diceValue + " and moved to " + newPosition);
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

    public boolean isOver() {
        return players.stream().anyMatch(player -> player.getPosition() == board.getSize()-1);
    }
}
