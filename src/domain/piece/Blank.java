package domain.piece;

import domain.board.Position;

public class Blank extends Piece {
    public Blank(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }

    @Override
    public Piece moveTo(Position toPosition) {
        return new Blank(pieceType, color, toPosition, representation);
    }

    public static Blank createBlank(Position position) {
        return new Blank(PieceType.BLANK, ColorCase.BLANK, position, '.');
    }
}
