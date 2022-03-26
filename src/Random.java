import java.security.SecureRandom;
import java.util.Scanner;

public class Random {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        SecureRandom ran = new SecureRandom();

        for (int j = 1; j <= 10; j++){
            int firstRandomNumber = 1 + ran.nextInt(100);
            int secondRandomNumber = 1 + ran.nextInt(100);
            String operand = "+-/*%";
            int size = operand.length();
            char sign = 0;

            for (int i = 1; i < 10; i++) {
                sign = operand.charAt(ran.nextInt(size));
            }
                System.out.printf("%s %s %s%n", firstRandomNumber, sign, secondRandomNumber);
        }

        for (int k = 1; k <= 10; k++){
        System.out.print("Enter your answers: ");
        int answer = input.nextInt();
        }








        

    }
}
