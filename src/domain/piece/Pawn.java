package domain.piece;

import domain.board.Position;

public class Pawn extends Piece {
    public Pawn(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }

    @Override
    public Piece moveTo(Position toPosition) {
        return new Pawn(pieceType, color, toPosition, representation);
    }

    public static Pawn createWhite(Position position) {
        return new Pawn(PieceType.FIRST_WHITE_PAWN, ColorCase.WHITE, position, 'p');
    }
    public static Pawn createBlack(Position position) {
        return new Pawn(PieceType.FIRST_BLACK_PAWN, ColorCase.BLACK, position, 'P');
    }
}
