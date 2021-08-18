package domain.piece;

import domain.board.Position;

public class King extends Piece {

    public King(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }

    @Override
    public Piece moveTo(Position toPosition) {
        return new King(pieceType, color, toPosition, representation);
    }

    public static King createWhite(Position position) {
        return new King(PieceType.KING, ColorCase.WHITE, position, 'k');
    }

    public static King createBlack(Position position) {
        return new King(PieceType.KING, ColorCase.BLACK, position, 'K');
    }
}
