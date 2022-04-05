package CrapsGroupSix;

import java.security.SecureRandom;

public class Craps {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        int firstDie = 1 +random.nextInt(7);
        int secondDie = 1 + random.nextInt(7);
        int sum = firstDie + secondDie;
        System.out.println(sum);


        switch (sum){
            case 1: {
                if (sum == 7 && sum == 11);
                System.out.println("You win");
            }
            break;
            case 2: {
                if (sum == 2 || sum == 3 || sum == 12);
                System.out.println("Craps");
            }
            break;
            case 3: {
                if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10);
                System.out.println("Point");
            }
            break;
        }

    }

}
