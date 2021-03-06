package domain.board;

import domain.util.Direction;
import exception.InvalidPositionException;
import exception.OutOfBoardRangeException;

import java.util.Objects;

public class Position {
    private static final int ASCII_GAP = 96;
    private static final int NUMBER_GAP = 48;
    public static final int END_INDEX = 8;
    public static final int START_INDEX = 1;
    public static final int ROW_SIZE = 8;

    public int col;
    public int row;

    public Position(int col, int row) {
        if (!isInBoardRange(col, row)) {
            throw new OutOfBoardRangeException();
        }
        this.col = col;
        this.row = row;
    }


    public static Position of(int col, int row) {
        if (!isInBoardRange(col, row)) {
            throw new InvalidPositionException((char) (col + ASCII_GAP), (char) (row + NUMBER_GAP));
        }
        return new Position(col, row);
    }

    public static Position of(String position) {
        if (position.length() != 2) {
            System.out.println("2");
            throw new InvalidPositionException(position);
        }
        return of(position.charAt(0) - ASCII_GAP, position.charAt(1) - NUMBER_GAP);
    }


    public Position moveBy(Direction direction) {
        return new Position(col + direction.getCol(), row + direction.getRow());
    }

    public static boolean isInBoardRange(int col, int row) {
        return col <= END_INDEX && col >= START_INDEX &&
                row <= END_INDEX && row >= START_INDEX;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(col, position.col) && Objects.equals(row, position.row);
    }
}
