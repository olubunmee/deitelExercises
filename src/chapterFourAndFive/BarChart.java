package chapterFourAndFive;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number between 1 and 30: ");
            int a = input.nextInt();

            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }

        }

    }

}
