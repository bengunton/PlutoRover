import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ben on 07/12/17.
 */
public class RoverTest {
    @Test
    public void canMove(){
        Rover rover = new Rover();

        int initialRoverX = rover.getX();
        int initialRoverY = rover.getY();
        rover.sendCommand("F");

        int newRoverX = rover.getX();
        int newRoverY = rover.getY();

        // true if rover's old coordinates differ from new coordinates
        boolean hasMoved = initialRoverX != newRoverX ||
                initialRoverY != newRoverY;
        assertThat(hasMoved, is(true));
    }

    @Test
    public void canMoveForwardOneSquare() {
        Rover rover = new Rover();

        assertPosition(rover, 0, 0, Direction.N);
        rover.sendCommand("F");
        assertPosition(rover, 0, 1, Direction.N);
    }

    @Test
    public void canMoveBackwardOneSquare() {
        Rover rover = new Rover();

        assertPosition(rover, 0, 0, Direction.N);
        rover.sendCommand("B");
        assertPosition(rover, 0, -1, Direction.N);
    }

    private void assertPosition(Rover rover, int x, int y, Direction d) {
        assertThat(rover.getX(), is(x));
        assertThat(rover.getY(), is(y));
        assertEquals(rover.getDirection(), d);
    }
}
