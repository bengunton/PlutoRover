import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ben on 07/12/17.
 */
public class RoverTest {
    @Test
    public void canMove(){
        Rover rover = new Rover();;

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

}
