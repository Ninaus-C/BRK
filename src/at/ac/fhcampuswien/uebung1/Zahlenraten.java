package at.ac.fhcampuswien.uebung1;

import java.util.Random;
import java.util.Scanner;
public class Zahlenraten {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Zahlenraten =====");
        int random = new Random().nextInt(100) + 1;
        int tries = 0;
        int guessed;

        for (tries = 1; tries <= 10; tries++) {
            System.out.println(tries + ". Versuch: Bitte geben sie eine Zahl ein: ");
            guessed = scanner.nextInt();

            if (guessed == random) {
                System.out.println("G E W O N N E N!");
                return;
            }
            if (guessed < random) {
                System.out.print("Leider nicht, Zufallszahl ist größer! ");
            }
            if (guessed > random) {
                System.out.println("Leider nicht, Zufallszahl ist kleiner! ");
            }
        }
        System.out.println("Leider verloren!");

    }
}
