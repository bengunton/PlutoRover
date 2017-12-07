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
        return this.xCoord;
    }

    public int getY() {
        return this.yCoord;
    }

    public void sendCommand(String command) {
        if (command.equals("F")) {
            this.yCoord++;
        }

        if (command.equals("B")) {
            this.yCoord--;
        }
    }

    public Object getDirection() {
        return this.direction;
    }
}
