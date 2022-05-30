package chapterFourAndFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        for(int row = 1; row <= 10; row++) {
            for(int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int row = 10; row >= 1; row--) {
            for(int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int row = 1; row <= 10; row++) {
            for(int column = 1; column <= row; column++) {
                System.out.print(" ");
            }
            for(int rowTwo = 10; rowTwo >= row; rowTwo--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int row = 10; row >= 1; row--) {
            for(int column = 1; column <= row; column++) {
                System.out.print(" ");
            }
            for(int rowTwo = 10; rowTwo >= row; rowTwo--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
