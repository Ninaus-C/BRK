package at.ac.fhcampuswien.uebung1;

import java.util.Scanner;
public class Schaltjahrberechnung {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Jahr ein:");
        int jahr = scanner.nextInt();

        if (jahr % 4 != 0) {
            System.out.println(jahr + " ist kein Schaltjahr");
        } else if (jahr % 100 != 0) {
            System.out.println(jahr + " ist ein Schaltjahr");
        } else if (jahr % 400 == 0) {
            System.out.print(jahr + " ist ein Schaltjahr");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr");
        }

    }
}
