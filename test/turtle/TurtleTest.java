package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle ijapa;
    private SketchPad pad;

    @BeforeEach
    public void setup(){
        ijapa = new Turtle();
        pad = new SketchPad(0, 0);
    }

    @Test
    public void turtleCanBeCreated(){
        assertNotNull(ijapa);
    }

    @Test
    public void turtleHasAPenUpByDefault(){
        assertNotNull(ijapa);
        ijapa.isPenDown();
        assertFalse(ijapa.isPenDown());
    }

    @Test
    public void turtleCanPutPenDown(){
        assertNotNull(ijapa);
        ijapa.isPenDown();
        assertFalse(ijapa.isPenDown());
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
    }
    @Test
    public void turtleCanRaisePenUp(){
        assertNotNull(ijapa);
        ijapa.isPenDown();
        assertFalse(ijapa.isPenDown());
        ijapa.penDown();
        assertTrue(ijapa.isPenDown());
        ijapa.penUp();
    }

    @Test
    public void turtleFacingEastByDefault(){
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEast(){
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromSouth(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromWest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFromNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftFromEast(){
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFromNorth(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFromWest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFromSouth(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardFacingEast(){
        ijapa.move(3, pad);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingSouth(){
        ijapa.turnRight();
        ijapa.move(3, pad);
        assertEquals(new Position(2, 0), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingWest(){
        ijapa.move(3, pad);
        ijapa.turnRight();
        ijapa.move(3, pad);
        ijapa.turnRight();
        ijapa.move(3, pad);
        assertEquals(new Position(2, 0), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingNorth(){
        ijapa.move(3, pad);
        ijapa.turnRight();
        ijapa.move(3, pad);
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.move(3, pad);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleWritesWhenPenIsDown(){
        ijapa.penDown();
        SketchPad pad = new SketchPad(5, 5);
        ijapa.move(5, pad);
        String expected = "* * * * * \n         \n         \n         \n         \n";
        assertEquals(expected, pad.toString());
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }
}
