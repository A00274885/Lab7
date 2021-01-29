public class House extends Building implements Rooms
{
    private int rooms;

    public House()
    {
        rooms = DefaultRooms;
    }

    public House(int r)
    {
        rooms = r;
    }

    public House(int r, int w,int i)
    {
        rooms = r;
        super.set_num_roof(i);
        super.set_num_walls(w);
    }

    @Override
    public void SetNumRooms(int i)
    {
        rooms = i;
    }

    @Override
    public int GetNumRooms()
    {
        return rooms;
    }

    @Override
    public String toString()
    {
        return "This House has " + rooms + " rooms. " + super.toString();
    }
}
