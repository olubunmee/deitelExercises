package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle ijapa;

    @BeforeEach
    public void setup(){
        ijapa = new Turtle();
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
        ijapa.move(3);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingSouth(){
        ijapa.turnRight();
        ijapa.move(3);
        assertEquals(new Position(2, 0), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingWest(){
        ijapa.move(3);
        ijapa.turnRight();
        ijapa.move(3);
        ijapa.turnRight();
        ijapa.move(3);
        assertEquals(new Position(2, 0), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingNorth(){
        ijapa.move(3);
        ijapa.turnRight();
        ijapa.move(3);
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.move(3);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());
    }

}
