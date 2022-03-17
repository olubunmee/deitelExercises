package chapterTwo;

import java.util.Scanner;

public class TwoPointTwoEight{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter radius: ");
    int radius = input.nextInt();

    double pi = 3.14159;

    double diameter = 2 * radius;
    System.out.printf("Diameter is %f%n", diameter);

    double circumference = 2 * pi * radius;
    System.out.printf("Circumference is %f%n", circumference);

    double area = pi * radius * radius;
    System.out.printf("Area is %f%n", area);
}
}
