package Parking;

public class Parking2dImage {
    private Car[][] cars;

    public Parking2dImage(int floors, int lots) {
        cars = new Car[floors][lots];
    }

    public void park2d(Car car) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] == null) {
                    cars[i][j] = car;
                    System.out.println("Car is parked on floor " + (i + 1) + " slot " + (j + 1) + " ");
                    return;
                }
            }
            System.out.println("No slot available");
        }
    }

    public void takeTheCar2d(int carPlate) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] != null && cars[i][j].getNumberPlate() == carPlate) {
                    cars[i][j] = null;
                    System.out.println("Car is taken on floor " + (i + 1) + " slot " + (j + 1));
                    return;
                }

            }
        }
        System.out.println("Number Plate is incorrect");
    }

    public void findCars2d(int carPlate) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                if (cars[i][j] != null && cars[i][j].getNumberPlate() == carPlate) {
                    System.out.println("Car is located on floor " + (i + 1) + " slot " + (j + 1));
                    return;
                }
            }
        }
        System.out.println("Unable to find the car");
        return;
    }

    public void showParkingMap() {
        System.out.println("    ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Floor " + (i + 1));
            for (int j = 0; j < cars[i].length; j++) {

                if (cars[i][j] == null) {
                    System.out.print(" Slot " + (j + 1) + "EMPTY ");
                } else
                    System.out.print(" " + cars[i][j].getBrandName() + " " + cars[i][j].getModelName() + (i + 1) + " slot " + (j + 1));
            }
            System.out.println();
        }
    }
}


