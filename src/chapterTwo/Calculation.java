package chapterTwo;// Area and Volume calculation
import java.util.Scanner;
public class Calculation{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter radius: ");
	double radius = input.nextDouble();
	System.out.print("Enter length: ");
	double length = input.nextDouble();
	double pi = 3.14;
	double area = radius * radius * pi;
	double volume = area * length;
	System.out.printf("The area is %f%n", area);
	System.out.printf("The volume is %f%n", volume);
	}
}