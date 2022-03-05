import java.util.Scanner;
import java.util.ArrayList;

public class Simulation
{
    public static void main(String[] args)
    {
        String base = "1313 Mockingbird Lane Apt 6A, Springfield, MO ";
        ArrayList<Package> packages = new ArrayList<Package>();
        int[] zipCodes = {11368, 11385, 11365, 11374, 11377, 11355, 11375, 11691, 11372, 11434, 11432, 11435, 11354, 11420, 11419, 11413, 11365, 11374, 11367, 11421, 11357, 11101, 11418, 11412, 11106, 11379, 11378, 11358, 11105, 11433, 11364, 11103, 11369, 11102, 11422, 11417, 11001, 11423, 11361, 11416, 11414, 11429, 11104, 11370, 11356, 11427, 11692, 11426, 11694, 11411, 11428, 11436, 11360, 11362, 11415, 11366, 11004, 11693, 11096, 11363, 11697, 11439, 11005, 11109, 11424, 11430, 11425, 11359, 11120, 11351, 11352, 11371, 11380, 11381, 11386, 11390, 11405, 11431, 11451, 11499, 11690, 11695, 11437};

        System.out.print("How many packages do you want to simulate?: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int zip = zipCodes[((int)(Math.random() * zipCodes.length))];
        double weight = 0;
        Address origin = new Address(base + zip);
        Address destination = new Address(base + zip);
        double height = 2;
        double length = 2;
        double width = 2;

        for (int i = 0; i < num; i++)
        {
            zip = zipCodes[((int)(Math.random() * zipCodes.length))];
            origin = new Address(base + zip);

            zip = zipCodes[((int)(Math.random() * zipCodes.length))];
            destination = new Address(base + zip);

            weight = (int) (Math.random() * 100) + 0.1;

            height = (int) (Math.random() * 99) + 2;
            length = (int) (Math.random() * 99) + 2;
            width = (int) (Math.random() * 99) + 2;

            packages.add(new Package(origin, destination, weight, height, length, width));
        }

        for (int i = 0; i < packages.size(); i++)
        {
            System.out.println("Package " + (i + 1) + " Test: ");
            System.out.println("Package was sent from: " + packages.get(i).getOrigin());
            System.out.println("Package was sent to: " + packages.get(i).getDestination());
            System.out.println("Package weight was: " + packages.get(i).getWeight() + " pounds");
            System.out.println("Package size was: " + packages.get(i).getSize() + " inches");
            System.out.println("Package postage was worth: $" + PostageCalculator.calculatePostage(packages.get(i)));
            System.out.println("---------------");
        }
    }
}