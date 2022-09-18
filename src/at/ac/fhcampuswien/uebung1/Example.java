package at.ac.fhcampuswien.uebung1;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        Contact c1 = new Contact("Christian", "Ninaus");
        Contact c2 = new Contact("Sarah", "Guger");

        contacts.add(c1);
        contacts.add(c2);

        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i);
            System.out.println(c.getFirstName() + " " + c.getLastName());
        }
        for (Contact c: contacts) {
            System.out.println(c.getFirstName() + " " + c.getLastName());
        }

    }
}
