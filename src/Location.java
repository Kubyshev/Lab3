/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || obj.getClass() != this.getClass())
            return false;
        Location Loco = (Location) obj;
        return xCoord == Loco.xCoord && yCoord == Loco.yCoord;
    }

    @Override
    public int hashCode() {
        int res = 1;//любое простое число(для определения res)
        //Возьмём другое число из головы
        res=10*res+xCoord;
        res=10*res+yCoord;
        return res;
    }
}