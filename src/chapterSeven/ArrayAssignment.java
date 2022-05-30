package chapterSeven;

import java.util.Arrays;

public class ArrayAssignment{

    public static void main(String[] args) {

        int[] numbers = {1, 92, 3, 4, 15, 26, 117, 48, 19, 10};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        float average = (float)sum / (float)numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
        System.out.println("Average = "+ average);

        int maximumNumber = numbers[0];
        for (int num : numbers) {
            if (num > maximumNumber){
                maximumNumber = num;
            }
        }
        System.out.println(maximumNumber);













    }
}
