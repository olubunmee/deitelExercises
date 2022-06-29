package chapterTwo;

import java.util.Arrays;

public class Peak {
    public static void main(String[] args) {
        int [] number = {1, 2, 4, 4, 3, 6, 10, 7};
        System.out.println(Arrays.toString(findPeak(number)));
    }

    public static int[] findPeak(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i +1] && array[i] > array[i - 1])
                return new int[]{array[i]};
        }
        return array;
    }
}
