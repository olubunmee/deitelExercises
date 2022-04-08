package CrapsGroupSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    static SecureRandom random = new SecureRandom();
    static Scanner scanner = new Scanner(System.in);
    static int firstDie = 1 + random.nextInt(6);
    static int secondDie = 1 + random.nextInt(6);
    static int sum = firstDie + secondDie;
    static int round = 0;


    public static void main(String[] args) {
        System.out.println("Welcome to the game of craps");
        System.out.println("Press y to roll dice: ");
        scanner.next("y");

        rollDice();
        win();
        lose();
        point();
    }
    public static void rollDice(){
        System.out.println(firstDie + ", " + secondDie + " -->> " + sum);
    }

    public static void win(){
        if (sum == 7 || sum == 11)
            System.out.println("Yay, you win!");
    }
    
    public static void lose(){
        if (sum == 2 || sum == 3 || sum == 12)
            System.out.println("Oops, you lose!");
    }
    
    public static void point(){
        if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10){
            System.out.println("Your point, roll again!");
            int point = sum;
            rollDice();
            for(int i = 1; i != 0; i++){
                if(sum == 7){
                    System.out.println("You lose");
                break;}
                else if (sum == point)
                    System.out.println("You win");
                break;
            }
        }
    }
}