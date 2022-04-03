package chapterFourAndFive;

import java.security.SecureRandom;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SecureRandom ran = new SecureRandom();

        int correct = 0;
        int wrong = 0;

        for (int i = 1; i < 10; i++){

            int number = ran.nextInt(1,6);
            int firstRandomNumber = 1 + ran.nextInt(10);
            int secondRandomNumber = 1 + ran.nextInt(10);

            switch (number){
                case 1:{
                    System.out.printf("%d * %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber * secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct!");
                    }else System.out.println("wrong");
                    wrong++;
                }
                case 2:{
                    System.out.printf("%d / %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber / secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct!");
                    }else System.out.println("wrong");
                    wrong++;
                }
                case 3:{
                    System.out.printf("%d + %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber + secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct");
                    }else System.out.println("wrong");
                    wrong++;
                }
                case 4:{
                    System.out.printf("%d - %d = ", firstRandomNumber,secondRandomNumber);
                    int result = firstRandomNumber - secondRandomNumber;
                    int userResult = input.nextInt();
                    if (result == userResult){correct++;
                        System.out.println("correct");
                    }else System.out.println("wrong");
                    wrong++;
                }
                break;
            }

        }

        System.out.println("correct answers = " + correct);
        System.out.println("wrong answers = " + wrong);





    }
}
