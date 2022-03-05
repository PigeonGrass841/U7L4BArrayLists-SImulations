public class PostageCalculator {
    //Takes in the package.
    public static double calculatePostage(Package items)
    {
        final double BASE_COST = 3.75;
        final double EXPENSE = 0.05;
        final double SIZE_COST = 0.1;
        final double WEIGHT_COST = 0.1;
        double weightCost = (items.getWeight() / 0.1) * EXPENSE;
        if (items.getWeight() > 40)
        {
            weightCost += WEIGHT_COST * ((items.getWeight() - 40) * 10);
        }
        double originCountyCode = Integer.parseInt(items.getOrigin().getZipCode().substring(0, 3));
        double destinationCountyCode = Integer.parseInt(items.getDestination().getZipCode().substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        int size = (int) (items.getHeight() + items.getLength() + items.getWidth());
        if (size > 36)
        {
            double sizeCost = SIZE_COST * (size - 36);
            return BASE_COST + weightCost + distanceCost + sizeCost;
        }
        return BASE_COST + weightCost + distanceCost;
    }

    //Takes in the 2 zip codes and the weight of the package.
    public static double calculatePostage(String originZipCode, String destinationZipCode, double weight)
    {
        final double BASE_COST = 3.75;
        final double EXPENSE = 0.05;
        final double WEIGHT_COST = 0.1;
        double weightCost = (weight / 0.1) * EXPENSE;
        if (weight > 40)
        {
            weightCost += WEIGHT_COST * ((weight - 40) * 10);
        }
        double originCountyCode = Integer.parseInt(originZipCode.substring(0, 3));
        double destinationCountyCode = Integer.parseInt(destinationZipCode.substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        return BASE_COST + weightCost + distanceCost;
    }

    public static double calculatePostage(String originZipCode, String destinationZipCode, double weight, double height, double length, double width)
    {
        final double BASE_COST = 3.75;
        final double EXPENSE = 0.05;
        final double SIZE_COST = 0.1;
        final double WEIGHT_COST = 0.1;
        double weightCost = (weight / 0.1) * EXPENSE;
        if (weight > 40)
        {
            weightCost += WEIGHT_COST * ((weight - 40) * 10);
        }
        double originCountyCode = Integer.parseInt(originZipCode.substring(0, 3));
        double destinationCountyCode = Integer.parseInt(destinationZipCode.substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        int size = (int) (height + length + width);
        if (size > 36)
        {
            double sizeCost = SIZE_COST * (size - 36);
            return BASE_COST + weightCost + distanceCost + sizeCost;
        }
        return BASE_COST + weightCost + distanceCost;
    }

    //Takes in the 2 addresses and the weight of the package.
    public static double calculatePostage(Address origin, Address destination, double weight)
    {
        final double BASE_COST = 3.75;
        final double EXPENSE = 0.05;
        final double WEIGHT_COST = 0.1;
        double weightCost = (weight / 0.1) * EXPENSE;
        if (weight > 40)
        {
            weightCost += WEIGHT_COST * ((weight - 40) * 10);
        }
        double originCountyCode = Integer.parseInt(origin.getZipCode().substring(0, 3));
        double destinationCountyCode = Integer.parseInt(destination.getZipCode().substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        return BASE_COST + weightCost + distanceCost;
    }

    public static double calculatePostage(Address origin, Address destination, double weight, double height, double length, double width)
    {
        final double BASE_COST = 3.75;
        final double EXPENSE = 0.05;
        final double SIZE_COST = 0.1;
        final double WEIGHT_COST = 0.1;
        double weightCost = (weight / 0.1) * EXPENSE;
        if (weight > 40)
        {
            weightCost += WEIGHT_COST * ((weight - 40) * 10);
        }
        double originCountyCode = Integer.parseInt(origin.getZipCode().substring(0, 3));
        double destinationCountyCode = Integer.parseInt(destination.getZipCode().substring(0, 3));
        double distanceCost = Math.abs(originCountyCode - destinationCountyCode) / 100;
        int size = (int) (height + length + width);
        if (size > 36)
        {
            double sizeCost = SIZE_COST * (size - 36);
            return BASE_COST + weightCost + distanceCost + sizeCost;
        }
        return BASE_COST + weightCost + distanceCost;
    }
}
