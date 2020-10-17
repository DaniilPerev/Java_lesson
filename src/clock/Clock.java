package clock;

import java.util.Random;

public class Clock {
    private int hour;
    private int minute;
    private int battery;

    public Clock() {
        Random random = new Random();
        this.hour = random.nextInt(24);
        this.minute = random.nextInt(60);
        this.battery = random.nextInt(101);
        start();
    }

    private void start() {
        int counter = 0;
        for (; battery > 0; ) {
            minute++;
            if (minute == 60) {
                hour++;
                minute = 0;
                if (hour == 24) {
                    counter++;
                    hour = 0;
                    if (counter == 1) {
                        battery--;
                        counter = 0;
                    }
                }
            }
            System.out.println(hour + ":" + minute + "  battery =" + battery + "%");

        }
    }

    public void changeBattery() {
        Random random = new Random();
   battery = random.nextInt(101);
    start();
    }
}
