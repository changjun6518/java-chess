package domain.strategy;

import domain.board.Board;
import domain.board.Position;
import domain.piece.Piece;
import domain.util.Direction;

import java.util.ArrayList;
import java.util.List;

public class PawnMoveStrategy implements MoveStrategy{
    @Override
    public List<Position> possiblePositions(Board board, Piece piece) {
        List<Position> possiblePositions = new ArrayList<>();

        for (Direction direction : piece.directions()) {

            if (piece.isNextPositionValid(direction)) {
                Position nextPosition = piece.getPosition().moveBy(direction);
                Piece nextPiece = board.findPieceByPosition(nextPosition);

                // Pawn은 앞에 기물이 있으면 앞으로 못감
                if (direction.isForwardDirection()) {
                    if (nextPiece.isBlank()) {
                        possiblePositions.add(nextPosition);
                    }
                    continue;
                }

                if (nextPiece.isOtherPiece(piece)) {
                    possiblePositions.add(nextPosition);
                }
            }
        }
        return possiblePositions;
    }
}
