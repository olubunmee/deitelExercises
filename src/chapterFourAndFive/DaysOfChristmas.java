package chapterFourAndFive;

import java.util.Scanner;

public class DaysOfChristmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day of christmas");
        int day = input.nextInt();

        switch (day) {
            case 12 -> System.out.println("On the twelfth day of christmas my true love said to me");
            case 11 -> System.out.println("On the eleventh day of christmas my true love said to me");
            case 10 -> System.out.println("On the tenth day of christmas my true love said to me");
            case 9 -> System.out.println("On the ninth day of christmas my true love said to me");
            case 8 -> System.out.println("On the eighth day of christmas my true love said to me");
            case 7 -> System.out.println("On the seventh day of christmas my true love said to me");
            case 6 -> System.out.println("On the sixth day of christmas my true love said to me");
            case 5 -> System.out.println("On the fifth day of christmas my true love said to me");
            case 4 -> System.out.println("On the fourth day of christmas my true love said to me");
            case 3 -> System.out.println("On the third day of christmas my true love said to me");
            case 2 -> System.out.println("On the second day of christmas my true love said to me");
            case 1 -> System.out.println("On the first day of christmas my true love said to me");
        }


        switch (day){
            case 12:{
                System.out.println("twelve drummers drumming");
            }
            case 11:{
                System.out.println("eleven pipers piping");
            }
            case 10:{
                System.out.println("ten lords a-leaping");
            }
            case 9:{
                System.out.println("nine ladies dancing");
            }
            case 8:{
                System.out.println("eight maid a-milking");
            }
            case 7:{
                System.out.println("seven swans a-swimming");
            }
            case 6:{
                System.out.println("six geese a-laying");
            }
            case 5:{
                System.out.println("five golden rings(five golden rings)");
            }
            case 4:{
                System.out.println("four calling birds");
            }
            case 3:{
                System.out.println("three french hens");
            }
            case 2:{
                System.out.println("two turtle-doves");
            }
            case 1:{
                System.out.println("and a partridge in a pear tree");
            }
            default:
        }
    }
}
