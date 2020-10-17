package car;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car(155, -45);
        tesla.on();
        tesla.speedUp(110);
        tesla.off();
        tesla.on();
        tesla.speedUp(60);
        tesla.speedDown(30);
        tesla.speedUp(160);
        tesla.speedUp(160);
        tesla.speedDown(-210);
    }
}
