package gameAssignment;

import static gameAssignment.BoardElements.EMPTY;

public class GameResult {

    private Board board;
    private Players player;
    private BoardElements [][] boardElements;

    public static boolean firstRow(BoardElements[][] myBoardElements){
        if (myBoardElements[0][0]!= EMPTY)
            return myBoardElements[0][0] == myBoardElements[0][1] &&
                    myBoardElements[0][0] == myBoardElements[0][2];
        return false;
    }

    public static boolean secondRow(BoardElements[][] myBoardElements){
        if (myBoardElements[1][0]!= EMPTY)
            return myBoardElements[1][0] == myBoardElements[1][1] &&
                    myBoardElements[1][0] == myBoardElements[1][2];
        return false;
    }

    public static boolean thirdRow(BoardElements[][] myBoardElements){
        if (myBoardElements[2][0]!= EMPTY)
            return myBoardElements[2][0] == myBoardElements[2][1] &&
                    myBoardElements[2][0] == myBoardElements[2][2];
        return false;
    }

    public static boolean firstColumn(BoardElements[][] myBoardElements){
        if (myBoardElements[0][0]!= EMPTY)
            return myBoardElements[0][0] == myBoardElements[1][0] &&
                    myBoardElements[0][0] == myBoardElements[2][0];
        return false;
    }

    public static boolean secondColumn(BoardElements[][] myBoardElements){
        if (myBoardElements[0][1]!= EMPTY)
            return myBoardElements[0][1] == myBoardElements[1][1] &&
                    myBoardElements[0][1] == myBoardElements[2][1];
        return false;
    }

    public static boolean thirdColumn(BoardElements[][] myBoardElements){
        if (myBoardElements[0][2]!= EMPTY)
            return myBoardElements[0][2] == myBoardElements[1][2] &&
                    myBoardElements[0][2] == myBoardElements[2][2];
        return false;
    }

    public static boolean firstDiagonal(BoardElements[][] myBoardElements){
        if (myBoardElements[0][0]!= EMPTY)
            return myBoardElements[0][0] == myBoardElements[1][1] &&
                    myBoardElements[0][0] == myBoardElements[2][2];
        return false;
    }

    public static boolean secondDiagonal(BoardElements[][] myBoardElements){
        if (myBoardElements[0][2]!= EMPTY)
            return myBoardElements[0][2] == myBoardElements[1][1] &&
                    myBoardElements[0][2] == myBoardElements[2][0];
        return false;
    }

    public static boolean hasWon(BoardElements[][] myBoardElements){
        return firstRow(myBoardElements) || secondRow(myBoardElements) || thirdRow(myBoardElements)
                || firstColumn(myBoardElements) || secondColumn(myBoardElements) || thirdColumn(myBoardElements)
                || firstDiagonal(myBoardElements) || secondDiagonal(myBoardElements);
    }
}
