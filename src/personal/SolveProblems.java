package personal;

// input two numbers and divide the without using the modulo or divide sign

import java.util.Scanner;

public class SolveProblems {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int dividend = input.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = input.nextInt();

        int count = 0;

        while(dividend >= divisor) {
            count++;
            dividend = dividend - divisor;
        }
        System.out.println("Quotient is: " + count);
        System.out.println("Remainder is: " + dividend);

//  multiply

        System.out.println("Enter first: ");
        int first = input.nextInt();

        System.out.println("Enter second: ");
        int second = input.nextInt();

        int counter = 1;
        int answer = 0;
        while (counter <= second){
           counter++;
            answer = answer + first;
        }
        System.out.println("product: " + answer);
    }
}
