package at.ac.fhcampuswien.uebung1;

public class AddressManagementTest {
    public static void main (String[] args) {

        Contact2 contact2 = new Contact2("Christian", "Ninaus");
        Adress address2 = new Adress("Herbststraße 37", "Vienna", 1160, "Austria");
        contact2.setEmail("christian.ninaus@gmx.net");
        contact2.setPhone("0660/4197999");


        contact2.print();
        address2.print();
        System.out.println();
    }
}
