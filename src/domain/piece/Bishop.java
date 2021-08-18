package domain.piece;

import domain.board.Position;

public class Bishop extends Piece {

    public Bishop(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }

    @Override
    public Piece moveTo(Position toPosition) {
        return new Bishop(pieceType, color, toPosition, representation);
    }

    public static Bishop createWhite(Position position) {
        return new Bishop(PieceType.BISHOP, ColorCase.WHITE, position, 'b');
    }
    public static Bishop createBlack(Position position) {
        return new Bishop(PieceType.BISHOP, ColorCase.BLACK, position, 'B');
    }
}
