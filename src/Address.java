public class Address {
    private String address;
    private String streetNum;
    private String streetName;
    private String apartmentNum;
    private String city;
    private String state;
    private String zipCode;

    //Takes in the separate pieces of the address and assigns them to the proper fields. (Apartment number)
    public Address(String streetNum, String streetName, String apartmentNum, String city, String state, String zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.address = streetNum + " " + streetName + " " + apartmentNum  + ", " + city + ", " + state + " " + zipCode;
    }

    //Takes in the separate pieces of the address and assigns them to the proper fields. (No apartment number)
    public Address(String streetNum, String streetName, String city, String state, String zipCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.address = streetNum + " " + streetName + ", " + city + ", " + state + " " + zipCode;
    }

    //Takes in an address object and copies its information into the fields.
    public Address(Address info)
    {
        this.streetNum = info.getStreetNum();
        this.streetName = info.getStreetName();
        this.address = this.streetNum + " " + this.streetName;
        if (info.getApartmentNum() != null)
        {
            this.apartmentNum = info.getApartmentNum();
            this.address +=  " " + apartmentNum;
        }
        this.city = info.getCity();
        this.state = info.getState();
        this.zipCode = info.getZipCode();
        this.address += ", " + this.city + ", " + this.state + " " + this.zipCode;
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
            this.address = this.streetNum + " " + this.streetName;
        }
        else
        {
            this.streetName = info.substring(0, info.indexOf("Apt") - 1);
            info = info.substring(info.indexOf("Apt"));
            this.apartmentNum = info.substring(0, info.indexOf(","));
            info = info.substring(info.indexOf(",") + 2);
            this.address = this.streetNum + " " + this.streetName + " " + apartmentNum;
        }
        this.city = info.substring(0, info.indexOf(","));
        info = info.substring(info.indexOf(",") + 2);
        this.state = info.substring(0, info.indexOf(" "));
        info = info.substring(info.indexOf(" ") + 1);
        this.zipCode = info.substring(0);
        this.address += ", " + this.city + ", " + this.state + " " + this.zipCode;
    }

    //Takes in an Address Object as a parameter and compares it to the current object. It will return true if they are
    //the same and false if not.
    public boolean compareAddressTo(Address info)
    {
        if (info.getAddress().equals(this.address))
        {
            return true;
        }
        else
        {
            return false;
        }

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

    public String getAddress()
    {
        return this.address;
    }

    //Returns the address in the following format: Number Street Apt Number (optional), City, State Zip
    public String toString()
    {
        return address;
    }
}
