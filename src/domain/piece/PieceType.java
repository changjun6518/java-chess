package domain.piece;

import domain.board.Board;
import domain.board.Position;
import domain.strategy.*;
import domain.util.Direction;
import domain.util.Directions;

import java.util.List;

public enum PieceType {
    FIRST_BLACK_PAWN(new PawnMoveStrategy(), Directions.FIRST_BLACK_PAWN_DIRECTION, 1),
    FIRST_WHITE_PAWN(new PawnMoveStrategy(), Directions.FIRST_WHITE_PAWN_DIRECTION, 1),
    WHITE_PAWN(new PawnMoveStrategy(), Directions.WHITE_PAWN_DIRECTION, 1),
    BLACK_PAWN(new PawnMoveStrategy(), Directions.BLACK_PAWN_DIRECTION, 1),


    KNIGHT(new SingleMoveStrategy(), Directions.KNIGHT_DIRECTION, 2.5),
    KING(new SingleMoveStrategy(), Directions.KING_DIRECTION, 0),

    ROOK(new MultipleMoveStrategy(), Directions.ROOK_DIRECTION, 5),
    BISHOP(new MultipleMoveStrategy(), Directions.BISHOP_DIRECTION, 3),
    QUEEN(new MultipleMoveStrategy(), Directions.QUEEN_DIRECTION, 9),

    BLANK(new BlankStrategy(), Directions.BLANK_DIRECTION, 0);



    private final MoveStrategy moveStrategy;
    private final Directions directions;
    private final double point;

    PieceType(MoveStrategy moveStrategy, Directions directions, double point) {
        this.moveStrategy = moveStrategy;
        this.directions = directions;
        this.point = point;
    }

    public List<Direction> directions() {
        return directions.directions();
    }

    public List<Position> possiblePositions(Board board, Piece piece) {
        return moveStrategy.possiblePositions(board, piece);
    }

    public double getPoint() {
        return point;
    }
}
