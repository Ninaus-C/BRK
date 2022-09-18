package at.ac.fhcampuswien.uebung1;

import java.util.Scanner;

public class Uebung7 {
    public static int sumofdigits() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return number;
    }
}
