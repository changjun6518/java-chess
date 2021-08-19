import controller.Controller;

import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controller.setBoard();
        while (true) {
            Controller.move(sc);
            Controller.showBoard();
        }
    }
}
