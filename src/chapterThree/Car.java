package chapterThree;

public class Car {

    private String model;
    private String year;
    private double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice(int percentage) {
        double discountInDouble = (double) percentage / 100;
        return price - discountInDouble * price;
    }
}
