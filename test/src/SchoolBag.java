package test.src;

public class SchoolBag {
    private String colour;
    private double weight = 0;
    private double max_load;

    public SchoolBag(String colour, double max_load)
    {
        this.colour = colour;
        this.max_load = max_load;
    }

    void load(double books)
    {
        if((weight + books) > max_load)
        {
            System.out.println("Overload, too heavy");
        }
        else{
            System.out.println("Put in successfully");
            weight = weight + books;
        }
    }
}
