package gameAssignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void setUp(){
        ticTacToe = new TicTacToe();
    }
    @Test
    public void gameExistsTest(){
        assertNotNull(ticTacToe);
    }

    @Test
    public void gameCanGetElements(){

    }
}
