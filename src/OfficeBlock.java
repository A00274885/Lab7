public class OfficeBlock extends Building implements Cubicles
{
    private int cubicles;

    public OfficeBlock()
    {
        cubicles = DefaultCubicles;
    }

    public OfficeBlock(int c)
    {
        cubicles = c;
    }

    public OfficeBlock(int c, int r, int w)
    {
        cubicles = c;

        super.set_num_roof(r);

        super.set_num_walls(w);
    }

    @Override
    public void SetNumCubicles(int i)
    {
        cubicles = i;
    }

    @Override
    public int GetNumCubicles() {
        return 0;
    }

    @Override
    public String toString() {
        return "This office block has " + cubicles + " cubicles " + super.toString();
    }
}
