package Fridge_Interactive;

import java.util.Scanner;

public class Fridge_Interactive {
    private boolean isOn = false;
    private boolean isDoorOpen = false;
    private boolean lampOn = false;
    private Scanner  scanner = new Scanner(System.in);
    public Fridge_Interactive() {start(); }
    private void start() {
        System.out.printf("1- Turn On The Fridge 2- Turn Off The Fridge 3- Open The Door 4- Close The Door");
        int choice = scanner.nextInt();
        if (choice == 1) {
            on();
        }
        if (choice == 2) {
            off();
        }
        if (choice == 3) {
            openDoor();
        }
        if (choice == 4) {
            closeDoor();
        }
        start();
    }


    private void on() {
        isOn = true;
        System.out.println("Fridge is on");
        if (isDoorOpen == true) {
            lampOn = true;
            System.out.println("Lamp is on");
        }

    }

    private void off() {
        isOn = false;
        System.out.println("fridge is off");
        lampOn = false;
        if (isDoorOpen == true) {
            lampOn = false;
            System.out.println("Lamp is off");
        }
    }
    private void openDoor () {
        isDoorOpen = true;
        System.out.println("Door is open");
        if (isOn == true) {
            lampOn = true;
            System.out.println("Lamp is on");
        }


    }
    private void closeDoor () {
        isDoorOpen = false;
        System.out.println("Door is closed");
        if (isOn == true) {
            lampOn = false;
            System.out.println("Lamp is off");
        }
    }
}


