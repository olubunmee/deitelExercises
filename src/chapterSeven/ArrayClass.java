package chapterSeven;

public class ArrayClass {


    public static void main(String[] args) {

        int [] numbers = {2, 5, 1};

        linearArray(numbers);

        int [][] secNumbers = {{2, 1}, {10, 3}};

        twoDArray(secNumbers);
    }

    public static void twoDArray(int[][] numbers) {
        int sum = 0;

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
            sum = sum + numbers[row][column];
            }
        }
        System.out.println(sum);
    }

    public static void linearArray(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];

        }

        System.out.println(sum);


    }
}




