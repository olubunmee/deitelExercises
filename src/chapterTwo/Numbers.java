package chapterTwo;

import java.util.Scanner;

public class Numbers{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int a = input.nextInt();

    System.out.print("Enter 2nd number: ");
    int b = input.nextInt();

    System.out.print("Enter 3rd number: ");
    int c = input.nextInt(); 

    int largest = a;

        if (b > largest) {
    largest = b; }

        if (c > largest) {
    largest = c; }

    int smallest = a;

        if (b < smallest) {
    smallest = b; }

        if (c < smallest) {
    smallest = c; }

            System.out.printf("%d is the largest %n", largest);

            System.out.printf("%d is the smallest", smallest);
    
    }

}
