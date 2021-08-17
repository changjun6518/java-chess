package domain.piece;

import domain.board.Position;

public abstract class Piece {
    protected PieceType pieceType;
    protected ColorCase color;
    protected Position position;
    protected char representation;

    public Piece(PieceType pieceType, ColorCase color, Position position, char representation) {
        this.pieceType = pieceType;
        this.color = color;
        this.position = position;
        this.representation = representation;
    }
}
