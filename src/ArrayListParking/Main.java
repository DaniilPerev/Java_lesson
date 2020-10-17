package ArrayListParking;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(10);
        Car tesla = new Car("tesla", "model x", "white", 12345);
        Car volkswagen = new Car("volkswagen", "tiguan", "white", 54321);
        Car bmw = new Car("bmw", "x2", "black", 13254);
        parking.park(tesla);
        parking.park(volkswagen);
        parking.park(bmw);
        parking.takeTheCar(123);
        parking.findCar(12345);
        parking.findCar(54321);
        parking.findCar(13254);
        parking.park(bmw);
        parking.findCar(422345242);
        
    }
}
