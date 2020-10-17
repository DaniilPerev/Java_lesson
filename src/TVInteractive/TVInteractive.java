package TVInteractive;

import java.util.Scanner;

public class TVInteractive {
    private boolean isOn = false;
    private int volume = 0;
    private int channels = 1;
    private int maxChannels;
    private Scanner scanner = new Scanner(System.in);

    public TVInteractive(int maxChannels) {
        this.maxChannels = maxChannels;
        start();
    }


    private void start() {
        System.out.println("1-Turn On  2-Turn Off  3-Volume Up  4-Volume Down  5-Channel Up  6-Channel Down  7-Channel Set");
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
            channelUp();
        }
        if (choice == 6) {
            channelDown();
        }
        if (choice == 7) {
            System.out.println("Choose a channel:");
            int channelChoice = scanner.nextInt();
            channelSet(channelChoice);
        }
        start();
    }


    private void on() {
        isOn = true;
        System.out.println("TV is on, channel " + channels + " volume " + volume);
    }

    private void off() {
        isOn = false;
        System.out.println("TV is off");
    }

    private void volumeUp() {
        if (isOn == true) {
            volume++;
            if (volume >= 100) {
                volume = 100;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }

    private void volumeDown() {
        if (isOn == true) {
            volume--;
            if (volume <= 0) {
                volume = 0;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }

    private void channelUp() {
        if (isOn == true) {
            channels++;
            if (channels > maxChannels) {
                channels = 1;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }

    private void channelDown() {
        if (isOn == true) {
            channels--;
            if (channels < 1) {
                channels = maxChannels;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }

    private void channelSet(int channels) {
        if (isOn == true) {
            if (channels >= 1 && channels <= maxChannels) {
                this.channels = channels;
                System.out.println("Volume is " + volume + " channel is " + channels);
            }
        }
    }
}


