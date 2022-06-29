package gameAssignment;

import static gameAssignment.BoardElements.*;
import static gameAssignment.Players.*;

public class TicTacToe {

    private static Board board = new Board();
    private static Players player = PLAYER_ONE;

    public static void playAtIndex(int row, int column, BoardElements e){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Board.getBoardArray()[row][column].equals(EMPTY))
                    Board.setBoardArray(row, column, e);
            }
        }
    }

    public static void getPlayerPositionFromUserEntry(int entry, BoardElements e) {
        switch(entry) {
            case 1 -> playAtIndex(0, 0, e);
            case 2 -> playAtIndex(0, 1, e);
            case 3 -> playAtIndex(0, 2, e);
            case 4 -> playAtIndex(1, 0, e);
            case 5 -> playAtIndex(1, 1, e);
            case 6 -> playAtIndex(1, 2, e);
            case 7 -> playAtIndex(2, 0, e);
            case 8 -> playAtIndex(2, 1, e);
            case 9 -> playAtIndex(2, 2, e);
        }
    }

    public static void changePlayer(){
        if (player == PLAYER_ONE) player = PLAYER_TWO;
        else player = PLAYER_ONE;
    }

    public static BoardElements assignBoardElementsTo(Players player){
        if (player == PLAYER_ONE)
            return X;
        else return O;
    }
}
