package domain.piece;

import domain.board.Position;

public class Knight extends Piece{
    public Knight(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }
    public static Knight createWhite(Position position) {
        return new Knight(PieceType.KNIGHT, ColorCase.WHITE, position, 'n');
    }
    public static Knight createBlack(Position position) {
        return new Knight(PieceType.KNIGHT, ColorCase.BLACK, position, 'N');
    }
}
