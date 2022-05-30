package tddClass;

import java.util.Arrays;

public class Kata {
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber){result = secondNumber - firstNumber;}
        if (firstNumber > secondNumber){result = firstNumber - secondNumber;}
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius)/7.0;
    }

    public int flip(int bit) {
        int result = 0;
        if (bit == 0) result = 1;
        if (bit == 1) result = 0;
        return result;
    }

    public boolean isPalindrome(int isPalindrome) {
        return true;
    }

    public int square(int number) {
        return number * number;
    }

    public int copy(int copy) {
        int totalPrice = 0;
        if(copy <= 4 && copy >= 1){totalPrice = (copy * 2000);}
        if (copy <= 9 && copy >=5){totalPrice = (copy * 1800);}
        if (copy <= 29 & copy >= 10){totalPrice = (copy * 1600);}
        if (copy <= 49 & copy >= 30){totalPrice = (copy * 1500);}
        if (copy <= 99 & copy >= 50){totalPrice = (copy * 1300);}
        if (copy <= 199 & copy >= 100){totalPrice = (copy * 1200);}
        if (copy <= 499 & copy >= 200){totalPrice = (copy * 1100);}
        if (copy >= 500){totalPrice = (copy * 1000);}
        return totalPrice;
    }

    public int quotient(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public boolean isEven(int value){
        if (value % 2 == 0)
        {return true;}
        return false;
    }

    public int biggest(int numOne, int numTwo, int numThree, int numFour, int numFive) {
        int largest = numOne;

        if (numTwo > numOne) {
            largest = numTwo;}
        if (numThree > largest) {
            largest = numThree;}
        if (numFour > largest) {
            largest = numFour;}
        if (numFive > largest) {
            largest = numFive;}
        return largest;
    }

    public int factorsOfNumbers(int input) {
        int count = 0;
        for (int i = 1; i <= input; i++){
        if (input % i == 0) {
            count++;}
        }
        return count;
    }

    public boolean primeNumber(boolean prime) {
        return true;
    }

    public int findMaximumFrom(int[] scores) {
        int maximum = scores[0];
        int j;
        for (j = 0; j <= 4; j++){
            if (scores[j] > maximum) {
                maximum = scores[j];
            }
        }
        return maximum;
    }

    public int findMinimumFrom(int[] scores) {
        int minimum = scores[4];
        int k;
        for (k = 4; k > 1; k--){
            minimum = scores[k];
        }
        return minimum;
    }

    public static void main(String[] args) {
        int [] array = new int[20];
        System.out.println(Arrays.toString(array));
    }
}
