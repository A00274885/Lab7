public class Building implements Walls, Roof
{
    private int roof,walls;

    public Building()
    {
        roof = DEFAULT_ROOFS;
        walls = DEFAULT_WALLS;
    }

    public Building(int r, int w)
    {
        roof = r;
        walls = w;
    }

    @Override
    public void set_num_walls(int w)
    {
        walls = w;
    }

    @Override
    public int get_num_walls()
    {
        return walls;
    }

    @Override
    public void set_num_roof(int r)
    {
        roof = r;
    }

    @Override
    public int get_num_roof()
    {
        return roof;
    }

    public String toString()
    {
        return "It has " + walls + " walls and " + roof + " roofs";
    }
}
