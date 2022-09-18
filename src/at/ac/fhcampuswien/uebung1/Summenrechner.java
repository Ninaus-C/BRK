package at.ac.fhcampuswien.uebung1;

import java.util.Scanner;
public class Summenrechner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben sie 10 Zahlen ein:");
        float count;
        float sum = 0;
        for (count = 0; count < 10; count = count + 1) {
            sum = sum + scanner.nextFloat();
        }
        System.out.println(sum);
        System.out.println(sum / count);
    }

}
