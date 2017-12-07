/**
 * Created by ben on 07/12/17.
 */
public enum Direction {
    N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

    // Fields to represent increase in X and Y co-ordinate of an object moving
    // forward in this direction
    private int moveX, moveY;

    Direction(int moveX, int moveY) {
        this.moveX = moveX;
        this.moveY = moveY;
    }

    // Return direction after rotating right once
    public Direction rotateRight() {
        return values()[(ordinal() + 1) % values().length];
    }

    // Return direction after rotating left once
    public Direction rotateLeft() {
        return values()[(ordinal() + values().length - 1) % values().length];
    }

    public int getMoveX() {
        return moveX;
    }

    public int getMoveY() {
        return moveY;
    }
}
