package chapterFourAndFive;

import java.security.SecureRandom;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SecureRandom ran = new SecureRandom();

        int correct = 0;
        int wrong = 0;

        for (int i = 1; i <= 10; i++){

            int number = ran.nextInt(1,4);
            int firstRandomNumber = 1 + ran.nextInt(11);
            int secondRandomNumber = 1 + ran.nextInt(11);

            switch (number){
                case 1:{
                    System.out.printf("%d * %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber * secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct!");
                    }
                    else {
                        System.out.println("wrong");
                    wrong++;
                    }
                    break;
                }
                case 2:{
                    System.out.printf("%d / %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber / secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct!");
                    }
                    else {
                        System.out.println("wrong");
                    wrong++;
                    }
                    break;
                }
                case 3:{
                    System.out.printf("%d + %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber + secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct");
                    }
                    else {
                        System.out.println("wrong");
                    wrong++;
                    }
                    break;
                }
                case 4:{
                    System.out.printf("%d - %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber - secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct");
                    }
                    else {
                        System.out.println("wrong");
                    wrong++;
                    }
                    break;
                }
            }
        }

        System.out.println("Correct answers = " + correct);
        System.out.println("Wrong answers = " + wrong);
        System.out.println("Adjusted score = " + (correct - wrong));
    }
}
