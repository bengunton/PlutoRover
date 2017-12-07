/**
 * Created by ben on 07/12/17.
 */
public class Rover {
    private int xCoord;
    private int yCoord;
    private Direction direction;

    public Rover() {
        this.xCoord = 0;
        this.yCoord = 0;
        this.direction = Direction.N;
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }

    // Send a string command to the rover for it to act on
    public void sendCommand(String command) {

        if (command.equals("F")) {
            moveForward();
        }

        if (command.equals("B")) {
            moveBackward();
        }

        if (command.equals("R")) {
            rotateRight();
        }

        if (command.equals("L")) {
            rotateLeft();
        }
    }

    // Move the rover forward one space
    private void moveForward() {
        // update X and y coordinates with appropriate values depending on
        // direction
        xCoord += this.direction.getMoveX();
        yCoord += this.direction.getMoveY();
    }

    // Move the rover backward one space
    private void moveBackward() {
        // update X and y coordinates with appropriate values depending on
        // direction
        xCoord -= this.direction.getMoveX();
        yCoord -= this.direction.getMoveY();
    }

    // Rotate rover 90 degrees right
    private void rotateRight() {
        direction = direction.rotateRight();
    }

    // Rotate rover 90 degrees left
    private void rotateLeft() {
        direction = direction.rotateLeft();
    }

    public Object getDirection() {
        return direction;
    }
}
