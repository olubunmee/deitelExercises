package chapterTwo;

import java.util.Scanner;
public class TwoPointOneFive {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first integer: ");
	int a = input.nextInt();
	System.out.println("Enter second integer: ");
	int b = input.nextInt();
	int square1 = a * a;
	System.out.printf("Square 1 is %d%n",square1);
	int square2 = b * b;
	System.out.printf("Square 2 is %d%n",square2);
	int sumSquare = square1 + square2;
	System.out.printf("sum of squares is %d%n",sumSquare);
	int diffSquare = square1 - square2;
	System.out.printf("difference of squares is %d%n",diffSquare);



}



}