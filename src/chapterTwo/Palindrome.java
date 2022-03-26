package chapterTwo;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int numberOne = input.nextInt();

        System.out.println("Enter second number");
        int numberTwo = input.nextInt();

        System.out.println("Enter third number");
        int numberThree = input.nextInt();

        if (numberOne == numberThree && numberTwo == numberTwo && numberThree == numberOne){
            System.out.println("it is a palindrome");
        }


    }




}
