package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.ColorCase;

import java.util.Scanner;

public class Controller {

    static Board board;

    public static void setBoard() {
        BoardFactory.init();
        board = BoardFactory.createBoard();
        board.showBoard();
    }

    public static void showBoard() {
        board.showBoard();
    }
    public static void move(Scanner scanner) {
        System.out.println("이동 할래?");
//        String moveCommand = scanner.next();

        String source = scanner.next();
        String target = scanner.next();
        board.move(source, target, ColorCase.BLACK);
        String source2 = scanner.next();
        String target2 = scanner.next();
        board.move(source2, target2, ColorCase.WHITE);


    }

}
