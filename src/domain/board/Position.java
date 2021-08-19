package domain.board;

import domain.util.Direction;

public class Position {
    private static final int ASCII_GAP = 96;
    private static final int END_INDEX = 8;
    private static final int START_INDEX = 1;
    public int col;
    public int row;

    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }


    public static Position of(String x, String y) {
        return new Position(Integer.parseInt(x), Integer.parseInt(y));
    }

    public static Position of(String position) {
        System.out.println(position.charAt(0) - ASCII_GAP);
        return of(String.valueOf(position.charAt(0) - ASCII_GAP),
                String.valueOf(position.charAt(1)));
    }

    public static boolean isInboardRange(int col, int row) {
        return col <= END_INDEX && col >= START_INDEX &&
                row <= END_INDEX && row >= START_INDEX;
    }

    public Position moveBy(Direction direction) {
        return new Position(col + direction.getCol(), row + direction.getRow());
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
