package domain.util;

import java.util.Arrays;
import java.util.List;

public enum Directions {
    FIRST_WHITE_PAWN_DIRECTION(Arrays.asList(Direction.NORTH, Direction.NORTH_NORTH, Direction.NORTH_EAST, Direction.NORTH_WEST)),
    FIRST_BLACK_PAWN_DIRECTION(Arrays.asList(Direction.SOUTH, Direction.SOUTH_SOUTH, Direction.SOUTH_EAST, Direction.SOUTH_WEST)),
    WHITE_PAWN_DIRECTION(Arrays.asList(Direction.NORTH, Direction.NORTH_EAST, Direction.NORTH_WEST)),
    BLACK_PAWN_DIRECTION(Arrays.asList(Direction.SOUTH, Direction.SOUTH_EAST, Direction.SOUTH_WEST)),

    ROOK_DIRECTION(Arrays.asList(Direction.NORTH, Direction.EAST, Direction.WEST, Direction.SOUTH)),
    BISHOP_DIRECTION(Arrays.asList(Direction.NORTH_EAST, Direction.NORTH_WEST, Direction.SOUTH_EAST, Direction.SOUTH_WEST)),
    KNIGHT_DIRECTION(Arrays.asList(Direction.NORTH_NORTH_EAST, Direction.NORTH_NORTH_WEST, Direction.EAST_EAST_NORTH, Direction.EAST_EAST_SOUTH,
            Direction.SOUTH_SOUTH_EAST, Direction.SOUTH_SOUTH_WEST, Direction.WEST_WEST_SOUTH, Direction.WEST_WEST_NORTH)),
    QUEEN_DIRECTION(Arrays.asList(Direction.NORTH, Direction.NORTH_EAST, Direction.NORTH_WEST, Direction.EAST, Direction.SOUTH_EAST,
            Direction.SOUTH, Direction.SOUTH_WEST, Direction.WEST)),
    KING_DIRECTION(Arrays.asList(Direction.NORTH, Direction.NORTH_EAST, Direction.EAST, Direction.SOUTH_EAST,
            Direction.SOUTH, Direction.SOUTH_WEST, Direction.WEST, Direction.NORTH_WEST)),
    BLANK_DIRECTION(Arrays.asList()),
    ;



    private List<Direction> directions;

    Directions(List<Direction> directions) {
        this.directions = directions;
    }

    public List<Direction> directions() {
        return directions;
    }
}
