package domain.strategy;

import domain.board.Board;
import domain.board.Position;
import domain.piece.Piece;
import domain.util.Direction;

import java.util.ArrayList;
import java.util.List;

public class MultipleMoveStrategy implements MoveStrategy {

    @Override
    public List<Position> possiblePositions(Board board, Piece piece) {
        List<Position> possiblePositions = new ArrayList<>();

        for (Direction direction : piece.directions()) {
            Piece nextPiece = piece;
            while (nextPiece.isNextPositionValid(direction)) {
                Position nextPosition = nextPiece.getPosition().moveBy(direction);
                nextPiece = board.findPieceByPosition(nextPosition);

                if (nextPiece.isBlank()) {
                    possiblePositions.add(nextPosition);
                    nextPiece = board.findPieceByPosition(nextPosition);
                }

                else if (nextPiece.isOtherPiece(piece)) {
                    possiblePositions.add(nextPosition);
                    break;
                }

                else if (nextPiece.isSameColor(piece)) {
                    break;
                }
            }
        }
        return possiblePositions;
    }
}
