package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.piece.ColorCase;
import domain.util.Command;
import domain.view.InputView;
import domain.view.OutputView;

public class Controller {
    private static final int COMMAND_INDEX = 0;
    private static final int SOURCE_POSITION_INDEX = 1;
    private static final int TARGET_POSITION_INDEX = 2;

    private Board board;
    private String[] inputCommand;
    public Controller() {

    }

    public void run() {
        ColorCase currentTurn = ColorCase.WHITE;
        Command command = Command.START;

        while (!(command = inputCommandWithValidation()).isEnd()) {
            if (command.isStart()) {
                board = BoardFactory.createBoard();
                board.showBoard();
            }

            if (command.isMove()) {
                board.move(inputCommand[SOURCE_POSITION_INDEX], inputCommand[TARGET_POSITION_INDEX], currentTurn);
                currentTurn = reverseTurn(currentTurn);
                OutputView.printBoard(board.getBoard());
            }
        }
    }

    private ColorCase reverseTurn(ColorCase color) {
        if (color == ColorCase.WHITE) {
            return ColorCase.BLACK;
        }
        return ColorCase.WHITE;
    }

    private Command inputCommandWithValidation() {
        try {
            inputCommand = InputView.inputCommand();
            return Command.of(inputCommand[COMMAND_INDEX]);
        } catch (IllegalArgumentException e) {
            OutputView.printExceptionMessage(e.getMessage());
            return inputCommandWithValidation();
        }
    }

}
