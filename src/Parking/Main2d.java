package Parking;

public class Main2d {
    public static void main(String[] args) {
        Parking2dImage parking2d = new Parking2dImage(5, 5);
        Car tesla = new Car("tesla", "model x", "white", 12345);
        Car volkswagen = new Car("volkswagen", "tiguan", "white", 54321);
        Car bmw = new Car("bmw", "x2", "black", 13254);
        parking2d.park2d(tesla);
        parking2d.park2d(bmw);
        parking2d.park2d(volkswagen);
        parking2d.showParkingMap();
        parking2d.findCars2d(54321);
        parking2d.findCars2d(12345);
        parking2d.findCars2d(13254);
        parking2d.showParkingMap();
    }
}
