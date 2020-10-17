package RadioInteractive;

import Radio.Radio;

import java.util.Scanner;

public class RadioInteractive {
    private boolean isOn = false;
    private int volume = 0;
    private int currentStation = 0;
    private double[] radioStations = {100.0, 100.25, 100.42, 100.3, 100.4, 100.50, 100.6, 100.7, 100.87, 100.91, 100.1000000};
    private Scanner scanner = new Scanner(System.in);

    public RadioInteractive() {
        start();
    }
    private void start() {
        System.out.println("1-Turn On  2-Turn Off  3-Volume Up  4-Volume Down  5-Radio Up  6-Radio Down");
        int choice = scanner.nextInt();
        if (choice == 1) {
            on();
        }
        if (choice == 2) {
            off();
        }
        if (choice == 3) {
            volumeUp();
        }
        if (choice == 4) {
            volumeDown();
        }
        if (choice == 5) {
            radioUp();
        }
        if (choice == 6) {
            radioDown();
        }
        start();
    }
    private void on() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Radio station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    private void off() {
        if (isOn == true) {
            isOn = false;
            System.out.println("Radio is off");
        }
    }

    private void volumeUp() {
        if (isOn == true) {
            volume++;
            if (volume >= 100) {
                volume = 100;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    private void volumeDown() {
        if (isOn == true) {
            volume--;
            if (volume <= 0) {
                volume = 0;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    private void radioUp() {
        if (isOn == true) {
            currentStation++;
            if (currentStation >= radioStations.length) {
                currentStation = 0;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    private void radioDown() {
        if (isOn == true) {
            currentStation--;
            if (currentStation <= 0) {
                currentStation = radioStations.length - 1;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

}



