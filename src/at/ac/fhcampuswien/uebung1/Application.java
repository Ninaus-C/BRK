package at.ac.fhcampuswien.uebung1;

public class Application {
    public static void main(String[] args) {
        Uebung6.sayHello();
        Uebung6.square();
        Maximumberechnung.maximum();
        Uebung7.sumofdigits();

        int x = Uebung6.add(23, 78);
        System.out.println("Sum is " + x);
    }
}
