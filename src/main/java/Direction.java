/**
 * Created by ben on 07/12/17.
 */
public enum Direction {
    N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

    private int moveX, moveY;

    Direction(int moveX, int moveY) {
        this.moveX = moveX;
        this.moveY = moveY;
    }

    public Direction rotateRight() {
        return values()[(ordinal() + 1) % values().length];
    }

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
