package Parking;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int numberPlate;

    public Car(String brandName, String modelName, String color, int number) {
        this.brand = brandName;
        this.model = modelName;
        this.color = color;
        this.numberPlate = number;
    }
    public int getNumberPlate() {
        return numberPlate;
    }
    public String getBrandName() {
        return brand;
    }
    public String getModelName() {
        return model;
    }
}
