package chapterThree;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Account myAccount = new Account();

        System.out.println("Initial account = " + myAccount.getName());
        System.out.println("Please enter the name:");


        String theName = scanner.nextLine();

        myAccount.setName(theName);
        System.out.println();



        System.out.printf("Name in object myAccount is:%n%s%n",
                myAccount.getName() );
    }
}
