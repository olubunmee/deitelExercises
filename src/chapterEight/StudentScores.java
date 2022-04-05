package chapterEight;

import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of students: ");
        int students = input.nextInt();


        System.out.println("Enter number of subjects: ");
        int subjects = input.nextInt();


        int[][] grade = new int[students][subjects];

        // String[][] course = new String[Java][Python];


        for (int i = 0; i < students; i++){
            System.out.println("Enter Student number: ");
            grade [i][i] = input.nextInt();
            for (int j = 0 ; j < subjects; j++){
                System.out.println("Enter grade: ");
                grade[i][j] = input.nextInt();
            }
        }

        System.out.println("S/N");
        for (int i = 0; i < subjects; i++){
            System.out.println("    ");
        }
        for (int i = 0; i < students; i++){
            System.out.print(i + 1 + "    ");
            for (int j = 0; j < subjects; j++){
                System.out.print(grade[i][j] + "    ");
            }
            System.out.println();
        }









    }
}
