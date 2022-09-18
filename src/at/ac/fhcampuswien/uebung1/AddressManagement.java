package at.ac.fhcampuswien.uebung1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressManagement {

    public static void main(String[] args) {
        List<Contact2> contact2List = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String nextContact;

        do {
            System.out.println("Bitte geben Sie einen Kontakt ein : ");

            System.out.println("Vorname: ");
            String firstName = scanner.nextLine();
            System.out.println("Nachname: ");
            String lastName = scanner.nextLine();
            System.out.println("EMail: ");
            String email = scanner.nextLine();
            System.out.println("Telefonnummer: ");
            String phone = scanner.nextLine();
            System.out.println("Straße: ");
            String street = scanner.nextLine();
            System.out.println("Postleitzahl: ");
            int zipCode = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ort: ");
            String city = scanner.nextLine();
            System.out.println("Land: ");
            String country = scanner.nextLine();

            Adress address2 = new Adress(street, city, zipCode, country);
            Contact2 contact2 = new Contact2(firstName, lastName);
            contact2.setAddress(address2);
            contact2.setEmail(email);
            contact2List.add(contact2);

            System.out.println("Möchten Sie einen weiteren Kontakt anlegen? [j/n]");
            nextContact = scanner.nextLine();
        } while (nextContact.equals("j"));

        for(Contact2 c: contact2List) {
            c.print();
        }
    }
}