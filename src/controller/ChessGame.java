package controller;

import domain.piece.ColorCase;
import domain.player.Player;

import java.util.Scanner;

public class ChessGame {
    Player black;
    Player white;

    public void readyPlayers(Scanner scanner) {
        System.out.println("두 Player의 이름을 입력하시오!");
        String playerNameA = scanner.next();
        String playerNameB = scanner.next();
        black = new Player(playerNameA, ColorCase.BLACK);
        white = new Player(playerNameB, ColorCase.WHITE);
    }

    public void setBoard() {

    }
}
