package domain.view;

import domain.board.Position;
import domain.piece.Piece;

import java.util.List;

public class OutputView {
    private static final String NEW_LINE = System.lineSeparator();
    private static final int END_INDEX = 8;
    private static final int START_INDEX = 1;


    public static void printInputStartGuideMessage() {
        System.out.println("체스 게임을 시작합니다.");
        System.out.println("게임 시작 : start");
        System.out.println("게임 종료 : end");
        System.out.println("게임 이동 : move source위치 target위치 - 예. move b2 b3");
    }


    public static void printBoard(List<Piece> board) {
        for (int row = END_INDEX; row >= START_INDEX; row--) {
            for (int col = START_INDEX; col <= END_INDEX; col++) {
                System.out.print(board.get((row - 1) * Position.ROW_SIZE + col - 1).getRepresentation());
            }
            System.out.print(NEW_LINE);
        }
    }

    public static void printPoint(double whitePoint, double blackPoint) {
        System.out.println(String.format("흰색 점수는 %.1f, 검은색 점수는 %.1f 입니다!", whitePoint, blackPoint));
    }
    public static void printGameFinish() {
        System.out.println("왕이 잡혀서 게임이 종료되었습니다!");
    }
    public static void printExceptionMessage(String message) {
        System.out.println(message);
    }
}
