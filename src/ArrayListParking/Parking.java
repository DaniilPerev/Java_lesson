package ArrayListParking;



import java.util.ArrayList;

public class Parking {
   // private Car[] cars;
    private ArrayList <Car> cars = new ArrayList<>();

    public Parking(int size) {
        for (int i = 0; i < size; i++) {
            cars.add(null);
        }
        //cars = new Car[size];
    }

    public void park(Car car) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) == null) {
                cars.set(i, car);
                System.out.println("A car is parked on slot " + (i + 1));
                return;
            }
        }
        System.out.println("No slot available");
    }

    public void takeTheCar(int carPlate) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null && cars.get(i).getNumberPlate() == carPlate) {
                System.out.println("Car is taken on slot" + (i + 1));
                return;
            }

        }
        System.out.println("Number Plate is incorrect");
    }

    public void findCar(int carPlate) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i) != null && cars.get(i).getNumberPlate() == carPlate) {
                System.out.println("Car " + cars.get(i).getBrandName() + " " + cars.get(i).getModelName() + " is located on slot " + (i + 1));
                return;
            }
            System.out.println("Unable to find the car");
            return;
        }

    }

}
