package chapterTwo;

import java.util.Scanner;

public class FinancialApp{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter savings amount: ");
    int savingsAmount = input.nextInt();

    double monthlyInterest = 0.00417;

    double first = savingsAmount*(1+monthlyInterest);

    double second = (savingsAmount+first)*(1+monthlyInterest);

    double third = (savingsAmount+second)*(1+monthlyInterest);

    double fourth = (savingsAmount+third)*(1+monthlyInterest);

    double fifth = (savingsAmount+fourth)*(1+monthlyInterest);

    double sixth = (savingsAmount+fifth)*(1+monthlyInterest);

    System.out.printf("Account value in sixth month is %f%n", sixth);
    
    }
}
