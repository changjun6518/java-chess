package domain.piece;

import domain.board.Board;
import domain.board.Position;
import domain.util.Direction;

import java.util.List;

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

    public Position getPosition() {
        return position;
    }

    public char getRepresentation() {
        return representation;
    }

    public abstract Piece moveTo(Position toPosition);

    public List<Direction> directions() {
        return pieceType.directions();
    }

    public boolean isNextPositionValid(Direction direction){
        return Position.isInboardRange(position.getCol() + direction.getCol(),
                position.getRow() + direction.getRow());
    }

    public boolean isMovable(final Board board, final Piece targetPiece) {
        if (pieceType.possiblePositions(board, this).contains(targetPiece.getPosition())) {
            return true;
        }
        throw new IllegalArgumentException("해당 포지션으로 이동할 수 없습니다!");
    }

    public boolean isBlank() {
        return this instanceof Blank;
    }


    public boolean isOtherPiece(Piece piece) {
        return color.isNotSame(piece.color);
    }


    public boolean isSameColor(Piece piece){
        return color.isSame(piece.color);
    }

    public boolean isSameColor(ColorCase color){
        return this.color == color;
    }
}
