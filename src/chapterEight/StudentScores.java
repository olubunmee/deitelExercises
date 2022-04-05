package chapterEight;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] grade = new int[3][3];

        for (int i = 0; i <= 2; i++){
            System.out.println("Enter Student number: ");
            grade [i][i] = input.nextInt();
            for (int j = 0 ; j <= 2; j++){
                System.out.println("Enter grade: ");
                grade[i][i] = input.nextInt();
            }
        }
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.println(grade[i][j] + " ");
            }
            System.out.println();
        }
    }
}
