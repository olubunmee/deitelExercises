package chapterTwo;

import java.util.Scanner;
public class TwoPointOneSix {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter integer here: ");
	int x = input.nextInt();
	int xSquare = x * x;
	if (x == 100){
		System.out.printf("%d==100%n",x, 100);}
	if (xSquare == 100){
		System.out.printf("%d==100%n",xSquare, 100);}
	if (x != 100){
		System.out.printf("%d!=100%n",x, 100);}
	if (xSquare != 100){
		System.out.printf("%d!=100%n",xSquare, 100);}
	if (x <= 100){
		System.out.printf("%d<=100%n",x, 100);}
	if (xSquare <= 100){
		System.out.printf("%d<=100%n",xSquare, 100);}
	if (x >= 100){
		System.out.printf("%d>=100%n",x, 100);}
	if (xSquare >= 100){
		System.out.printf("%d>=100%n",xSquare, 100);}
	
}

}