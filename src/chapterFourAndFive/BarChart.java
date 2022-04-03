package chapterFourAndFive;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int a = input.nextInt();
        while (a >= 1 && a<= 30) {
            System.out.println("number");
            a = input.nextInt();
        }


    }
}
