public class Address {
    private String streetNum = "";
    private String streetName = "";
    private String apartmentNum = "";
    private String city = "";
    private String state = "";
    private String zipCode = "";

    //Takes in the separate pieces of the address and assigns them to the proper fields. (Apartment number)
    public Address(String streetNum, String streetName, String apartmentNum, String city, String state, String zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Takes in the separate pieces of the address and assigns them to the proper fields. (No apartment number)
    public Address(String streetNum, String streetName, String city, String state, String zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Takes in an address object and copies its information into the fields.
    public Address(Address info)
    {
        this.streetNum = info.getStreetNum();
        this.streetName = info.getStreetName();
        if (info.getApartmentNum().equals(""))
        {
            this.apartmentNum = info.getApartmentNum();
        }
        this.city = info.getCity();
        this.state = info.getState();
        this.zipCode = info.getZipCode();
    }

    //Takes in an address as a String, breaks up the information, and copies it into the fields.
    public Address(String info)
    {
        this.streetNum = info.substring(0, info.indexOf(" "));
        info = info.substring(info.indexOf(" ") + 1);
        if (info.indexOf("Apt") == -1)
        {
            this.streetName = info.substring(0, info.indexOf(","));
            info = info.substring(info.indexOf(",") + 2);
        }
        else
        {
            this.streetName = info.substring(0, info.indexOf("Apt") - 1);
            info = info.substring(info.indexOf("Apt"));
            this.apartmentNum = info.substring(0, info.indexOf(","));
            info = info.substring(info.indexOf(",") + 2);
        }
        this.city = info.substring(0, info.indexOf(","));
        info = info.substring(info.indexOf(",") + 2);
        this.state = info.substring(0, info.indexOf(" "));
        info = info.substring(info.indexOf(" ") + 1);
        this.zipCode = info.substring(0);
    }

    //Takes in an Address Object as a parameter and compares it to the current object. It will return true if they are
    //the same and false if not.
    public boolean compareAddressTo(Address info)
    {
        if (!(info.getStreetNum().equals(this.streetNum)))
        {
            return false;
        }
        if (!(info.getStreetName().equals(this.streetName)))
        {
            return false;
        }
        if (!(info.getApartmentNum().equals(this.apartmentNum)))
        {
            return false;
        }
        if (!(info.getCity().equals(this.city)))
        {
            return false;
        }
        if (!(info.getState().equals(this.state)))
        {
            return false;
        }
        if (!(info.getZipCode().equals(this.zipCode)))
        {
            return false;
        }
        return true;
    }

    public String getStreetNum()
    {
        return streetNum;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getApartmentNum()
    {
        return apartmentNum;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    //Returns the address in the following format: Number Street Apt Number (optional), City, State Zip
    public String toString()
    {
        String address = this.streetNum + " " + this.streetName + " ";
        if (this.apartmentNum != "")
        {
            address += this.apartmentNum;
        }
        address += ", " + this.city + ", " + this.state + " " + this.zipCode;
        return address;
    }
}
