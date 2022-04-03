package chapterEight;

import java.util.Arrays;

public class ArrayAssignment{

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        float average = (float)sum / (float)numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
        System.out.println("Maximum number = " + numbers[9]);
        System.out.println("Average = "+ average);
    }

}
