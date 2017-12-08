/**
 * Created by ben on 07/12/17.
 */
public class World {
    private int maxX, minX, maxY, minY;
    private WorldObject[][] grid;

    public World(int minX, int minY, int maxX, int maxY) {
        this.maxX = maxX;
        this.minX = minX;
        this.maxY = maxY;
        this.minY = minY;

        this.grid = new WorldObject[maxX - minX][maxY - minY];
    }

    // Adds a WorldObject to the world grid at a given position
    public void addObject(WorldObject obj) {
        grid[GetGridPosX(obj.getX())][GetGridPosY(obj.getY())] = obj;
    }

    // Move an object in the grid
    public void moveObject(int oldX, int oldY, int newX, int newY) {
        WorldObject obj = grid[GetGridPosX(oldX)][GetGridPosY(oldY)];
        grid[GetGridPosX(oldX)][GetGridPosY(oldY)] = null;
        this.grid[GetGridPosX(newX)][GetGridPosY(newY)] = obj;
    }

    // Gets the obj at a given co-ordinate location
    public WorldObject getObjAtLoc(int x, int y) {
        return grid[GetGridPosX(x)][GetGridPosY(y)];
    }

    // Returns the grid x position of an object with co-ordinate x
    private int GetGridPosX(int x) {
        return x - minX;
    }

    // Returns the grid y position of an object with co-ordinate y
    private int GetGridPosY(int y) {
        return y - minY;
    }
}
