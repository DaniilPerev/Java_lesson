package Parking;

public class Parking {
    private Car[] cars;

    public Parking(int size) {
        cars = new Car[size];
    }

    public void park(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                System.out.println("A car is parked on slot " + (i + 1));
                return;
            }
        }
        System.out.println("No slot available");
    }

    public void takeTheCar(int carPlate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getNumberPlate() == carPlate) {
                cars[i] = null;
                System.out.println("Car is taken on slot" + (i + 1));
                return;
            }

        }
        System.out.println("Number Plate is incorrect");
    }

    public void findCar(int carPlate) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null && cars[i].getNumberPlate() == carPlate) {
                System.out.println("Car " + cars[i].getBrandName() + " " + cars[i].getModelName() + " is located on slot " + (i + 1));
                return;
            }
            System.out.println("Unable to find the car");
            return;
        }
    }

}
