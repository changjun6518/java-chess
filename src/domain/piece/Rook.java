package domain.piece;

import domain.board.Position;

public class Rook extends Piece {

    public Rook(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }

    public static Rook createWhite(Position position) {
        return new Rook(PieceType.ROOK, ColorCase.WHITE, position, 'r');
    }
    public static Rook createBlack(Position position) {
        return new Rook(PieceType.ROOK, ColorCase.BLACK, position, 'R');
    }
}
