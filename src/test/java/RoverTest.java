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

        int RoverX = rover.getX();
        int RoverY = rover.getY();

        // confirm that we start at (0, 0)
        assertThat(RoverX, is(0));
        assertThat(RoverY, is(0));
        // confirm that we start facing North
        assertEquals(rover.getDirection(), Direction.N);

        rover.sendCommand("F");

        RoverX = rover.getX();
        RoverY = rover.getY();
        // confirm that we are now at (0, 1)
        assertThat(RoverX, is(0));
        assertThat(RoverY, is(1));
        // confirm that we are still facing North
        assertEquals(rover.getDirection(), Direction.N);
    }
}
