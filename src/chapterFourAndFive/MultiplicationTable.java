package chapterFourAndFive;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        for (int i = 0; i <= 12; i++) {
            System.out.println(number + " * " + i + " = " + i * number);
        }
    }



























}
