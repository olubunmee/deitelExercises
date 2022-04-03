package chapterFourAndFive;

import java.security.SecureRandom;
import java.util.Scanner;

public class RandomLoop {

    static int correct = 0;
    static int wrong = 0;


    public static void main(String[] args) {
        generateQuestions();
        System.out.println(correct++);
        System.out.println(wrong++);

    }

    public static void changeOperators(int input, int firstRandomNumber, int secondRandomNumber, int operator){
       int right = switch (operator){
            case 1 -> firstRandomNumber + secondRandomNumber;

            case 2 -> firstRandomNumber - secondRandomNumber;

            case 3 -> firstRandomNumber * secondRandomNumber;

            case 4 -> firstRandomNumber / secondRandomNumber;

           default -> 0;
       };
        if (input == right) correct++;
                if (input != right) wrong++;
    }

    public static void generateQuestions(){

        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            int operator = random.nextInt(1,6);
            int firstRandomNumber = 1 + random.nextInt(10);
            int secondRandomNumber = 1 + random.nextInt(10);
            switch (operator){
                case 1:{
                    System.out.println(firstRandomNumber + "+" + secondRandomNumber + "=");
                    input.nextInt();
                }
                case 2:{
                    System.out.println(firstRandomNumber + "*" + secondRandomNumber + "=");
                    input.nextInt();
                }
                case 3:{
                    System.out.println(firstRandomNumber + "-" + secondRandomNumber + "=");
                    input.nextInt();
                }
                case 4:{
                    System.out.println(firstRandomNumber + "/" + secondRandomNumber + "=");
                    input.nextInt();
                }
            }
        }
    }
}
