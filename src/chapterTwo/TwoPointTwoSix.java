package chapterTwo;

import java.util.Scanner;

public class TwoPointTwoSix {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();

	int numberTriple = number1 * number1 * number1;
	int numberDouble = number2 * number2;
	int multiple = numberTriple % numberDouble;

	if (multiple == 0){
	System.out.printf("%d is a multiple of %d%n",number1,number2);}

	if (multiple != 0){
	System.out.printf("%d is a not multiple of %d%n",number1,number2);}
}
}
