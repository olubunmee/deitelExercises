package chapterTwo;

import java.util.Scanner;
public class TwoPointOneSeven{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int a = input.nextInt();

	System.out.print("Enter second integer: ");
	int b = input.nextInt();

	System.out.print("Enter third integer: ");
	int c = input.nextInt();

	int sum = a + b + c;
	int product = a * b * c;
	float average = sum / 3;

	System.out.printf("sum is %d%n",sum);
	System.out.printf("product is %d%n",product);
	System.out.printf("average is %f%n%n",average);

	int Largest = a;

	if (b > a){
	Largest = b; }

	if (c > b){
	Largest = c; }

	System.out.printf("%d is the largest %n", Largest);

	int Smallest = a;

	if (b < a){
	Smallest = b; }

	if (c < b){
	Smallest = c; }

	System.out.printf("%d is the smallest %n", Smallest);
}


}