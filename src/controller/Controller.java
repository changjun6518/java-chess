package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.ColorCase;
import domain.player.Player;

import java.util.Scanner;

public class Controller {

    public static void readyPlayers(Scanner scanner) {
        System.out.println("두 Player의 이름을 입력하시오!");
        String playerNameA = scanner.next();
        String playerNameB = scanner.next();
    }

    public static void setBoard() {
        BoardFactory.init();
        Board board = BoardFactory.createBoard();
        board.showBoard();
    }
}
