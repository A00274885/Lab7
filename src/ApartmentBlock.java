public class ApartmentBlock extends Building implements Units
{
    private int units;

    public ApartmentBlock()
    {
        units = DefaultUnits;
    }

    public ApartmentBlock(int u)
    {
        units = u;
    }

    public ApartmentBlock(int u,int w,int r)
    {
        units = u;

        super.set_num_walls(w);

        super.set_num_roof(r);
    }

    @Override
    public void SetNumUnits(int i)
    {
        units = i;
    }

    @Override
    public int GetNumUnits()
    {
        return units;
    }

    @Override
    public String toString()
    {
        return "This Apartment has " + units + " units " + super.toString();
    }
}
