package at.ac.fhcampuswien.uebung1;

import java.util.Scanner;

public class Uebung6 {
    public static void sayHello() {
        System.out.println("Hello World");
    }

    public static void square() {
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input number:");
        x = scanner.nextInt();
        int result = x * x;
        System.out.println("The square is " + result);
    }
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
