public class Package {
    private Address origin;
    private Address destination;
    private double weight;

    //Takes in 2 Address objects (an origin and a destination) and a weight. The weight should be represented as a
    //double (2.4 pounds) and a package cannot weigh less than a tenth of a pound.
    public Package (Address origin, Address destination, double weight)
    {
        this.origin = origin;
        this.destination = destination;
        if (weight >= 0.1)
        {
            this.weight = weight;
        }
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
}
