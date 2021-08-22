package controller;

import domain.board.Board;
import domain.board.BoardFactory;
import domain.calculator.Calculator;
import domain.piece.ColorCase;
import domain.util.Command;
import domain.view.InputView;
import domain.view.OutputView;
import exception.InvalidPositionException;

public class Controller {
    private static final int COMMAND_INDEX = 0;
    private static final int SOURCE_POSITION_INDEX = 1;
    private static final int TARGET_POSITION_INDEX = 2;

    private Board board;
    private Calculator calculator;
    private String[] inputCommand;
    public Controller() {
        calculator = new Calculator();
    }

    public void run() {
        OutputView.printInputStartGuideMessage();
        ColorCase currentTurn = ColorCase.WHITE;
        Command command;

        while (!(command = inputCommandWithValidation()).isEnd()) {
            if (command.isStart()) {
                board = BoardFactory.createBoard();
                OutputView.printBoard(board.getBoard());
            }
            try {
                if (command.isMove()) {
                    board.move(inputCommand[SOURCE_POSITION_INDEX], inputCommand[TARGET_POSITION_INDEX], currentTurn);
                    currentTurn = reverseTurn(currentTurn);
                    OutputView.printBoard(board.getBoard());
                }
            } catch (IllegalArgumentException e) {
                OutputView.printExceptionMessage(e.getMessage());
            }

            if (command.isStatus()) {
                OutputView.printPoint(calculator.calculatePoint(board, ColorCase.WHITE),
                        calculator.calculatePoint(board, ColorCase.BLACK));
            }

            if (board.isFinished()) {
                OutputView.printGameFinish();
                break;
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
            moveCommandValidate(inputCommand);
            return Command.of(inputCommand[COMMAND_INDEX]);
        } catch (IllegalArgumentException e) {
            OutputView.printExceptionMessage(e.getMessage());
            return inputCommandWithValidation();
        }
    }

    private void moveCommandValidate(String[] inputCommand) {
        if (inputCommand[COMMAND_INDEX].equals("move") && inputCommand.length != 3) {
            throw new IllegalArgumentException("move source target 순으로 입력하시오! - 예. move b2 b3");
        }
    }

}
