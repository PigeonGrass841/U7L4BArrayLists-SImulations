public class Package {
    private Address origin;
    private Address destination;
    private double weight;
    private double height;
    private double length;
    private double width;

    //Takes in 2 Address objects (an origin and a destination) and a weight. The weight should be represented as a
    //double (2.4 pounds) and a package cannot weigh less than a tenth of a pound.
    public Package (Address origin, Address destination, double weight, double height, double length, double width)
    {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Address getOrigin()
    {
        return this.origin;
    }

    public Address getDestination()
    {
        return this.destination;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getLength()
    {
        return this.length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public int getSize()
    {
        return (int) (this.height + this.length + this.width);
    }
}
