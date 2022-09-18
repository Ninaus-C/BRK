package at.ac.fhcampuswien.uebung1;

import java.util.Scanner;
public class Maximumberechnung {
    public static void maximum() {
        float max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie 3 Zahlen ein:");
        float zahl1 = scanner.nextFloat();
        float zahl2 = scanner.nextFloat();
        float zahl3 = scanner.nextFloat();

        if (zahl1 > zahl2) {
            max = zahl1;
        } else {
            max = zahl2;
        }
        if (zahl3 > max) {
            max = zahl3;
        }
        System.out.println(max);





    }
}
