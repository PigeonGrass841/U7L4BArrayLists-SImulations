public class Simulation
{
    public static void main(String[] args)
    {
        //Takes in the separate pieces of the address and assigns them to the proper fields. (Apartment number)
        Address address1 = new Address("1313", "Mockingbird Lane", "Apt 6A", "Springfield", "MO", "65123");
        System.out.println(address1);
        //Takes in the separate pieces of the address and assigns them to the proper fields. (No apartment number)
        Address address2 = new Address("1313", "Mockingbird Lane", "Springfield", "MO", "65123");
        System.out.println(address2);

        System.out.println("---------------");

        //Takes in an address object and copies its information into the fields. (Apartment number)
        Address address3 = new Address(address1);
        System.out.println(address3);
        //Takes in an address object and copies its information into the fields. (No apartment number)
        Address address4 = new Address(address2);
        System.out.println(address4);

        System.out.println("---------------");

        //Takes in an address as a String, breaks up the information, and copies it into the fields. (Apartment Number)
        Address address5 = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        System.out.println(address5);
        //Takes in an address as a String, breaks up the information, and copies it into the fields. (No apartment number)
        Address address6 = new Address("1313 Mockingbird Lane, Springfield, MO 65123");
        System.out.println(address6);

        System.out.println("---------------");

        //Takes in an address1 as a parameter and compares it to the current object. It will return true if they are the same and false if not.
        System.out.println(address1.compareAddressTo(address2));
        System.out.println(address1.compareAddressTo(address3));
        System.out.println(address1.compareAddressTo(address4));
        System.out.println(address1.compareAddressTo(address5));
        System.out.println(address1.compareAddressTo(address6));

        System.out.println("---------------");

        //Takes in an address2 as a parameter and compares it to the current object. It will return true if they are the same and false if not.
        System.out.println(address2.compareAddressTo(address3));
        System.out.println(address2.compareAddressTo(address4));
        System.out.println(address2.compareAddressTo(address5));
        System.out.println(address2.compareAddressTo(address6));
    }
}
