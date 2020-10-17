package Car_int;

import java.util.Scanner;

public class Car_int {
    private boolean isOn = false;
    private int maxSpeed;
    private int speed = 0;
    private int minSpeed;
    private Scanner scanner = new Scanner(System.in);

   public Car_int(int maxSpeed, int minSpeed) {
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        start();
    }


    private void start() {
        System.out.println("1- Turn On  2- Turn Off  3- Speed Up 4- Speed Down");
        int choice = scanner.nextInt();
        if (choice == 1) {
            on();
        }
        if (choice == 2) {
            off();
        }
        if (choice == 3) {
            System.out.println("Additional Speed:");
            int choice1 = scanner.nextInt();
            speedUp(choice1);

        }
        if (choice == 4) {
            System.out.println("How much less speed");
            int choice2 = scanner.nextInt();
            speedDown(choice2);
        }
        start();
    }


    private void on() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Car is on");
        }
    }

    private void off() {
        if (isOn == true) {
            isOn = false;
            System.out.println("Car is off");
        }
    }

    private void speedUp(int speed) {
        if (isOn == true) {

            this.speed = this.speed + speed;
            if (this.speed > maxSpeed) {
                this.speed = maxSpeed;
            }
            System.out.println("Car speed is " + this.speed);
        }
    }

    private void speedDown(int speed) {
        if (isOn == true) {
            this.speed = this.speed - speed;
            if (this.speed < minSpeed) {
                this.speed = minSpeed;
            }
            System.out.println("Car speed is " + this.speed);
        }
    }
}





