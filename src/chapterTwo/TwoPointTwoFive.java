package chapterTwo;

import java.util.Scanner;

public class TwoPointTwoFive {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter integer: ");
	int number = input.nextInt();
	float calc = number % 3;

	if (calc == 0) {
	System.out.printf("%d is divisible by 3", number);}

	if (calc != 0) {
	System.out.printf("%d is not divisible by 3", number);}
}
}
