package Blender_Int;

import java.util.Scanner;

public class Blender_Int {
    private boolean isOn = false;
    private int blenderSpeed = 0;
    private int maxSpeed;
    private boolean isCupOn = true;
    private Scanner scanner = new Scanner(System.in);

    public Blender_Int(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        start();
    }
    private void start() {
        System.out.printf("1- Turn On 2- Turn Off 3- Cup On 4- Cup Off 5- Speed Up 6- Speed Down 7- Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            on();
        }
        if (choice == 2) {
            off();
        }
        if (choice == 3) {
            cupOn();
        }
        if (choice == 4) {
            cupOff();
        }
        if (choice == 5) {
            speedIsUp();
        }
        if (choice == 6) {
            speedIsDown();
        }
        if (choice == 7) {
            return;
        }
        start();
    }



    public void on() {
        isOn = true;
        System.out.println("Blender is on");

    }

    public void off() {
        isOn = false;
        System.out.println("Blender is off");
    }

    public void cupOff() {
        if (blenderSpeed == 0) {
            isCupOn = false;
            System.out.println("cup is off");



        }
    }

    public void cupOn() {
        if (isCupOn == false) {
            isCupOn = true;
            System.out.println("cup is on");
        }
    }

    public void speedIsUp() {

        if (isOn == true && isCupOn == true) {
            blenderSpeed++;
            if (blenderSpeed > maxSpeed) {
                blenderSpeed = maxSpeed;
            }
            System.out.println("Blender speed is " + blenderSpeed);
        }
    }

    public void speedIsDown() {
        if (isOn == true) {
            blenderSpeed--;
            if (blenderSpeed < 0) {
                blenderSpeed = 0;
            }
            System.out.println("Blender speed is " + blenderSpeed);
        }


    }
}


