/**
 * Created by ben on 07/12/17.
 */
public enum Direction {
    N, E, S, W;

    public Direction rotateRight() {
        return values()[(this.ordinal() + 1) % values().length];
    }
}
