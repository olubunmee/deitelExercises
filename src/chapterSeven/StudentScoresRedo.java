package chapterSeven;

import java.util.Scanner;

public class StudentScoresRedo {
    static Scanner scanner = new Scanner(System.in);
    private static int students;
    private static int subjects;

    static int [][] studentGrade = new int[students][subjects];

    public static void inputStudentScore(){
        System.out.println("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        System.out.println("Enter number of students: ");
        int students = scanner.nextInt();

        for (int i = 1; i <= students; i++) {
            System.out.println("Enter student number: ");
            studentGrade[i][i] = scanner.nextInt();
            for (int j = 1; j <= subjects; j++) {
                System.out.println("Enter student grade: ");
                studentGrade[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayArray(){
        System.out.print("S/N    ");
        for (int i = 1; i <= subjects; i++) {
            System.out.println("SUB " + i + "    Total    Average    Position");
        }
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + i);
            for (int j = 0; j < subjects; j++) {
                System.out.println(studentGrade[i][j] + "    ");
            }
        }
    }

    public static int calculateTotalAndAverage(){
        int total = 0;
        total = total + studentGrade[students][subjects];
        return total;
    }

    public static void main(String[] args) {
        inputStudentScore();
        displayArray();
    }





















}