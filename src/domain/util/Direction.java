package domain.util;

public enum Direction {
    NORTH(0, 1),
    SOUTH(0, -1),
    EAST(1, 0),
    WEST(-1, 0),
    NORTH_NORTH(0, 2),
    SOUTH_SOUTH(0, -2),
    NORTH_EAST(1, 1),
    NORTH_WEST(-1, 1),
    SOUTH_EAST(1, -1),
    SOUTH_WEST(-1, -1),
    SOUTH_SOUTH_EAST(1, -2),
    SOUTH_SOUTH_WEST(-1, -2),
    NORTH_NORTH_EAST(1, 2),
    NORTH_NORTH_WEST(-1, 2),
    EAST_EAST_SOUTH(2, -1),
    EAST_EAST_NORTH(2, 1),
    WEST_WEST_SOUTH(-2, -1),
    WEST_WEST_NORTH(-2, 1);

    int row;
    int col;

    Direction(int row, int col) {
        this.row = row;
        this.col = col;
    }
}