package at.ac.fhcampuswien.uebung1;

public class Sternchen1 {
    public static void main(String[] args) {
        int rows = 6;
        System.out.println("stairs");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("  pyramid");
        int reihen = 6;
        for (int reihe = 1; reihe <= reihen; reihe++) {
            for (int col = reihen; col > reihe; col--) {
                System.out.print(" ");
            }
            for (int star = 0; star < reihe*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
