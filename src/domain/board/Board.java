package domain.board;

import domain.piece.Blank;
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

    // move b2 b4
    public void move(String source, String target) {
        Piece sourcePiece = findPieceByPosition(Position.of(source));
        Piece targetPiece = findPieceByPosition(Position.of(target));

        // 빈칸인지
        // 순서가 맞는지
        // 갈수 있는지
        board.set(boardIndexOf(targetPiece.getPosition()), sourcePiece.moveTo(targetPiece.getPosition()));
        board.set(boardIndexOf(sourcePiece.getPosition()), Blank.createBlank(sourcePiece.getPosition()));

    }

    public Piece findPieceByPosition(Position position) {
        return board.get(getBoardIndex(position.getCol(), position.getRow()));
    }

    public int getBoardIndex(int col, int row) {
        return (row - 1) * 8 + col - 1;
    }

    public int boardIndexOf(Position position) {
        return getBoardIndex(position.getCol(), position.getRow());
    }
}
