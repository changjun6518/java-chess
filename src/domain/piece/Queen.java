package domain.piece;

import domain.board.Position;

public class Queen extends Piece{
    public Queen(PieceType pieceType, ColorCase color, Position position, char representation) {
        super(pieceType, color, position, representation);
    }

    @Override
    public Piece moveTo(Position toPosition) {
        return new Queen(pieceType, color, toPosition, representation);
    }

    public static Queen createWhite(Position position) {
        return new Queen(PieceType.QUEEN, ColorCase.WHITE, position, 'q');
    }
    public static Queen createBlack(Position position) {
        return new Queen(PieceType.QUEEN, ColorCase.BLACK, position, 'Q');
    }

}
