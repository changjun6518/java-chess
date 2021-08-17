package domain.board;

import domain.piece.Piece;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Piece> board;

    public Board(List<Piece> board) {
        this.board = board;
    }

    public void showBoard() {
        for (int i = 8; i >=1; i--) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(board.get((i-1)*8+j-1).getRepresentation());
            }
            System.out.println();
        }
    }
}
