package turtle;


public class Turtle {

    private Pen biro = new Pen();
    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0,0);

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penDown() {
        biro.penDown();
    }

    public void penUp() {
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == Direction.EAST)
            currentDirection = Direction.SOUTH;
        else if (currentDirection == Direction.SOUTH)
            currentDirection = Direction.WEST;
        else if (currentDirection == Direction.WEST)
            currentDirection = Direction.NORTH;
        else currentDirection = Direction.EAST;
    }

    public void turnLeft() {
        if (currentDirection == Direction.EAST)
            currentDirection = Direction.NORTH;
        else if (currentDirection == Direction.NORTH)
            currentDirection = Direction.WEST;
        else if (currentDirection == Direction.WEST)
            currentDirection = Direction.SOUTH;
        else currentDirection = Direction.EAST;
    }

    public void move(int noOfSteps, SketchPad pad) {
        if (isPenDown()){
            if (currentDirection == Direction.EAST) writeOnColumn(noOfSteps, pad);
        }
            if(currentDirection == Direction.EAST) increaseColumnBy(noOfSteps);
            if (currentDirection == Direction.SOUTH) increaseRowBy(noOfSteps);
            if (currentDirection == Direction.WEST) decreaseColumnBy(noOfSteps);
            if (currentDirection == Direction.NORTH) decreaseRowBy(noOfSteps);
        }

    private void writeOnColumn(int noOfSteps, SketchPad pad) {
        int [][] floor = pad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        for (int i = column; i < column + noOfSteps; i++) {
            floor[row][i] = 1;
        }
    }

    private void increaseRowBy(int noOfSteps) {
        int currentRowPosition = currentPosition.getRow();
        currentPosition.setRow(currentRowPosition + noOfSteps - 1);
    }

    private void increaseColumnBy(int noOfSteps) {
        int currentColumnPosition= currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition + noOfSteps - 1);
    }
    private void decreaseColumnBy(int noOfSteps) {
        int currentColumnPosition= currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition - noOfSteps + 1);
    }
    private void decreaseRowBy(int noOfSteps) {
        int currentRowPosition= currentPosition.getRow();
        currentPosition.setRow(currentRowPosition - noOfSteps + 1);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
