package domain.piece;

import domain.util.Direction;
import domain.util.Directions;

public enum PieceType {
    FIRST_BLACK_PAWN(Directions.FIRST_BLACK_PAWN_DIRECTION, 1),
    FIRST_WHITE_PAWN(Directions.FIRST_WHITE_PAWN_DIRECTION, 1),
    WHITE_PAWN(Directions.WHITE_PAWN_DIRECTION, 1),
    BLACK_PAWN(Directions.BLACK_PAWN_DIRECTION, 1),
    ROOK(Directions.ROOK_DIRECTION, 5),
    BISHOP(Directions.BISHOP_DIRECTION, 3),
    KNIGHT(Directions.KNIGHT_DIRECTION, 2.5),
    QUEEN(Directions.QUEEN_DIRECTION, 9),
    KING(Directions.KING_DIRECTION, 0),
    BLANK(Directions.BLANK_DIRECTION, 0),
    ;


    private final Directions directions;
    private final double point;

    PieceType(Directions directions, double point) {
        this.directions = directions;
        this.point = point;
    }
}
