package gameAssignment;

import java.util.Arrays;

import static gameAssignment.BoardElements.*;

public class Board {

    private static final BoardElements[][] boardArray = new BoardElements[3][3];

    public Board() {
        for (BoardElements[] boardElements : boardArray) {
            Arrays.fill(boardElements, EMPTY);
        }
    }

    public static void setBoardArray(int row, int column, BoardElements element){
        boardArray[row][column] = element;
    }

    public static BoardElements[][] getBoardArray() {
        return boardArray;
    }

    @Override
    public String toString() {
        return boardArray[0][0] + "|" + boardArray[0][1] + "|" + boardArray[0][2] + "\n" +
                "______" + "______" + "______" + "\n" +
                boardArray[1][0] + "|" + boardArray[1][1] + "|" + boardArray[1][2] + "\n" +
                "______" + "______" + "______" + "\n" +
                boardArray[2][0] + "|" + boardArray[2][1] + "|" + boardArray[2][2];
    }
}
