package at.ac.fhcampuswien.uebung1;

public class Contact2 {

        String firstName;
        String lastName;
        String email;
        String phone;
        Adress address;

    public void print() {
        System.out.println("Vorname : " + firstName);
        System.out.println("Nachname : " + lastName);
        System.out.println("EMail : " + email);
        System.out.println("Telefonnummer : " + phone);

    }

    public Contact2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Adress getAddress() {
        return address;
    }

    public void setAddress(Adress address) {
        this.address = address;
    }

    public void setAdress(Adress address2) {
    }
}
