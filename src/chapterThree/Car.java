package chapterThree;

public class Car {

    private String model;
    private String year;
    private double price;
    private double percentage;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice(double percentage) {
        return price - (percentage * price);
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
