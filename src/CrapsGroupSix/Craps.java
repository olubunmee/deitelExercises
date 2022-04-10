package CrapsGroupSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    static SecureRandom random = new SecureRandom();
    static Scanner scanner = new Scanner(System.in);
    static int point = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the game of craps");
        System.out.println("Press y to continue");
        scanner.next("y");
        firstRoll();
        secondRoll();
    }

    public static void firstRoll(){
        int firstDie = 1 + random.nextInt(6);
        int secondDie = 1 + random.nextInt(6);
        int sum = firstDie + secondDie;
        System.out.println(firstDie + ", " + secondDie + " = " + sum);
        if ((sum == 7) || (sum == 11)){
            System.out.println("Yay, you win!");
        }
        else if ((sum == 2) || (sum == 3) || (sum == 12)){
            System.out.println("Oops, you lose!");
        }
        else System.out.println("Your point, Try again!");
        
    }

    public static void secondRoll(){
        int firstDie = 1 + random.nextInt(6);
        int secondDie = 1 + random.nextInt(6);
        int sum = firstDie + secondDie;
        System.out.println(firstDie + ", " + secondDie + " = " + sum);
        if (sum == 7){
            System.out.println("Oops, you lose!");
        }
        else if (sum == point){
            System.out.println("Yay, you win!");
        }
        else {
            System.out.println("Try again!");
        }
    }
}