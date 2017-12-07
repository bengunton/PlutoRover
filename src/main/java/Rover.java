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
        // iterates over chars in the command, executing them until one fails
        for (int i = 0; i < command.length(); i++) {
            if (!executeInstruction(command.charAt(i))) {
                break;
            }
        }
    }

    // Exectute a single character command, returns true if movement was
    // successful
    public boolean executeInstruction(char instruction) {
        switch (instruction) {
            case 'F':
                moveForward();
                break;
            case 'B':
                moveBackward();
                break;
            case 'R':
                rotateRight();
                break;
            case 'L':
                rotateLeft();
                break;
            default:
                System.err.println("Invalid instruction received");
                return false;
        }
        return true;
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
