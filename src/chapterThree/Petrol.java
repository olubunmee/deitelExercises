package chapterThree;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PetrolPurchase buyPetrol = new PetrolPurchase("Ojota", "Gas", 0, 0.0, 0.0);

        System.out.println(buyPetrol.getLocation() + "    " + buyPetrol.getPetrolType() + "    " + buyPetrol.getQuantity() + "    " + buyPetrol.getPrice() + "    " + buyPetrol.getPercentage());

        System.out.println("Enter station location: ");
        String station = scanner.nextLine();
        buyPetrol.setLocation(station);


        System.out.println("Enter petrol type: ");
        String type = scanner.nextLine();
        buyPetrol.setPetrolType(type);


        System.out.println("Enter price: ");
        double elo = scanner.nextDouble();
        buyPetrol.setPrice(elo);


        System.out.println("Enter percentage: ");
        double slash = scanner.nextDouble();
        buyPetrol.setPercentage(slash);


        System.out.println("Filling station is " + station);
        System.out.println("Type of petrol is: " + type);
        System.out.println("Price of the petrol is " + elo);
        System.out.println("Discount is " + slash);
        System.out.println("Amount paid for petrol is: " + buyPetrol.getPurchaseAmount(10));

    }

}
