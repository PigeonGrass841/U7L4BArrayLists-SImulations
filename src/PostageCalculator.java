public class PostageCalculator {
    private final double BASE_COST = 3.75;
    private final double EXPENSE = 0.05;

    //Takes in the package.
    public double calculatePostage(Package items)
    {
        double weightCost = (items.getWeight() / 0.1) * EXPENSE;
        double originCountyCode = Integer.parseInt(items.getOrigin().getZipCode().substring(0, 3));
        double destinationCountyCode = Integer.parseInt(items.getDestination().getZipCode().substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        return BASE_COST + weightCost + distanceCost;
    }

    //Takes in the 2 zip codes and the weight of the package.
    public double calculatePostage(String originZipCode, String destinationZipCode, double weight)
    {
        double weightCost = (weight / 0.1) * EXPENSE;
        double originCountyCode = Integer.parseInt(originZipCode.substring(0, 3));
        double destinationCountyCode = Integer.parseInt(destinationZipCode.substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        return BASE_COST + weightCost + distanceCost;
    }

    //Takes in the 2 addresses and the weight of the package.
    public double calculatePostage(Address origin, Address destination, double weight)
    {
        double weightCost = (weight / 0.1) * EXPENSE;
        double originCountyCode = Integer.parseInt(origin.getZipCode().substring(0, 3));
        double destinationCountyCode = Integer.parseInt(destination.getZipCode().substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        return BASE_COST + weightCost + distanceCost;
    }
}
