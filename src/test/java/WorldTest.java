import org.junit.Test;

/**
 * Created by ben on 07/12/17.
 */
public class WorldTest {
    @Test
    public void canAddRover() {
        Rover rover = new Rover();
        World world = new World(0, 0, 100, 100);

        world.addObject(rover);
        assert(world.getObjAtLoc(rover.getX(), rover.getY()).equals(rover));
    }

    @Test
    public void canMoveRover() {
        Rover rover = new Rover();
        World world = new World(0, 0, 100, 100);

        world.addObject(rover);
        world.moveObject(0, 0, 3, 3);

        assert(world.getObjAtLoc(0, 0) == null);
        assert(world.getObjAtLoc(3, 3).equals(rover));
    }
}
