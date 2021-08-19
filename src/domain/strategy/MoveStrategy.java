package domain.strategy;

import domain.board.Board;
import domain.board.Position;
import domain.piece.Piece;

import java.util.List;

public interface MoveStrategy {
    List<Position> possiblePositions(Board board, Piece piece);
}
