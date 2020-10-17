package MicrowaveInteractive;

import java.util.Scanner;

public class MicrowaveInt {
    private boolean isOn = false; // field
    private boolean isOpen = false;
    private int timer = 0;
    private String mode = "Manual";
    private  Scanner scanner = new Scanner(System.in);

    public MicrowaveInt() {
        menu();
    }
    private void menu() {
        System.out.printf("1- Start 2- Turn On 3- Turn Off 4- Set Timer 5- Set Mode 6- Open Door 7- Shut The Door");
        int choice = scanner.nextInt();
        if (choice == 1) {
            start();
        }
        if (choice == 2) {
            on();
        }
        if (choice == 3) {
            off();
        }
        if (choice == 4) {
           setTime(1, 40);
        }
        if (choice == 5) {
            setMode();
        }
        if (choice == 6) {
            doorOpen();
        }
        if (choice == 7) {
            doorShut();
        }
        menu();
    }

    private void on() { //method
        isOn = true;
        System.out.println("Microwave if on");
    }

    private void off() {
        isOn = false;
        System.out.println("Microwave if off");
    }

    private void setTime(int min, int sec) {
        if (isOn == false) {
            return;
        }
        if (mode.equals("Manual")) {
            System.out.println("Enter time min:");
            min = scanner.nextInt();
            System.out.println("Enter time sec: " );
            sec = scanner.nextInt();
            timer = (min * 60) + sec;
            System.out.println("Time set: " + timer + " sec");
        }
    }
    private void setMode() {
        if (isOn == false) {
            return;
        }
        System.out.println("Cup  Plate Manual");
        String mode = scanner.next();
        if (mode.equals("Cup")) {
            timer = 70;
            this.mode = mode;

        }
        if (mode.equals("Plate")) {
            timer = 200
            ;this.mode = mode;
        }

        if (mode.equals("Manual")) {
            this.mode = mode;
        }

        System.out.println("Mode Set: " + mode);
    }
    private void doorOpen() {
        isOpen = true;
        System.out.println("Door is open");
    }
    private void doorShut() {
        isOpen = false;
        System.out.println("Door is shut");
    }
    private void start() {
        if (isOpen == true) {
            System.out.println("Door is open");
            return;
        }
        if (isOpen == false) {
            System.out.println("Microwave is working");
            return;
        }
        for (int i = timer; i > 0; i--) {
            System.out.println("timer: " + i/60 + ":" + i%60);
        }
        System.out.println("Finish");
    }
}




