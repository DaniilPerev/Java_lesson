package ArrayListParking;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int numberPlate;

    public Car(String brandName, String modelName, String color1, int number) {
        this.brand = brandName;
        this.model = modelName;
        this.color = color1;
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
