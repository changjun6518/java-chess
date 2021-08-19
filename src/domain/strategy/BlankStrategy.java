package domain.strategy;

import domain.board.Board;
import domain.board.Position;
import domain.piece.Piece;

import java.util.List;

public class BlankStrategy implements MoveStrategy {

    @Override
    public List<Position> possiblePositions(Board board, Piece piece) {
        throw new IllegalArgumentException("빈칸은 움직일 수 없습니다!");
    }
}
