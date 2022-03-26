package chapterTwo;

import java.util.Scanner;
public class TwoPointTwoFour{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int a = input.nextInt();

	System.out.print("Enter second integer: ");
	int b = input.nextInt();

	System.out.print("Enter third integer: ");
	int c = input.nextInt();
	
	System.out.print("Enter fourth integer: ");
	int d = input.nextInt();

	System.out.print("Enter fifth integer: ");
	int e = input.nextInt();

	int largest = a;

	if (b > a){
	largest = b; }

	if (c > largest){
	largest = c; }

	if (d > largest){
	largest = d; }

	if (e > largest){
	largest = e; }

	System.out.printf("%d is the largest %n", largest);

	int smallest = a;

	if (b < a){
	smallest = b; }

	if (c < smallest){
	smallest = c; }

	if (d < smallest){
	smallest = d; }

	if (e < smallest){
	smallest = e; }

	System.out.printf("%d is the smallest %n", smallest);
	}


}