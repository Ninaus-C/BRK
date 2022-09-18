package at.ac.fhcampuswien.uebung1;

public class Adress {

        String street;
        String city;
        int zipCode;
        String country;

    public void print() {
        System.out.println("Straße = " + street);
        System.out.println("Stadt = " + city);
        System.out.println("PLZ = " + zipCode);
        System.out.println("Land = " + country);
    }

    public Adress(String street, String city, int zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
