package chapterEight;

import java.security.SecureRandom;

public class Arrays {
    public static void main(String[] args) {
//        int [] scores = new int[10];
//        scores[4] = 20;
//
//        System.out.println(scores[4]);
//
//        System.out.println(java.util.chapterEight.Arrays.toString(scores));
//
//        boolean [] oniro = new boolean[5];
//        System.out.println(java.util.chapterEight.Arrays.toString(oniro));
//
//
//        oniro[2] = true;
//        System.out.println(java.util.chapterEight.Arrays.toString(oniro));

//        String [] [] meals = new String[2][2];
//        System.out.println(java.util.chapterEight.Arrays.deepToString(meals));
//
//        meals[0][0] = "rice";
//        meals[0][1] = "garri";
//        meals[1][0] = "beans";
//        meals[1][1] = "peanut";
//
//        System.out.println(meals[0][1]);
//        System.out.println(java.util.chapterEight.Arrays.deepToString(meals));
//

//        int[] elements = new int[300];
//        for (int i = 1; i <= 300;){
//            elements[0] = i++;
//            System.out.print(elements[0] + " ");
//        }


        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'n', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                 '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        SecureRandom ran = new SecureRandom();

        for (int i = 0; i < 13; i++){
            String password = String.valueOf(letters[ran.nextInt(62)]);
            System.out.print(password);

        }





//        String[][] ticTacToe = new String[3][3];
//        System.out.println(java.util.chapterEight.Arrays.deepToString(ticTacToe));
//
//        ticTacToe[0][0] = "X";
//        ticTacToe[0][1] = "0";
//        ticTacToe[0][2] = "X";
//
//        ticTacToe[1][0] = "X";
//        ticTacToe[1][1] = "X";
//        ticTacToe[1][2] = "X";
//
//        ticTacToe[2][0] = "O";
//        ticTacToe[2][1] = "X";
//        ticTacToe[2][2] = "O";
//
//
//        for (int i = 0; i <= 2; i++){
//            for (int j = 0; j <= i; j++){
//        System.out.print(ticTacToe[i][j] + " ");
//            }
//        }



    }

}
