/**
 * Created by ben on 07/12/17.
 */
public class Rover {
    private int xCoord;
    private int yCoord;

    public Rover() {
        this.xCoord = 0;
        this.yCoord = 0;
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
    }
}
