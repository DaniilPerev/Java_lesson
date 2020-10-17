package Radio;

public class Radio {
    private boolean isOn = false;
    private int volume = 0;
    private int currentStation = 0;
    private double[] radioStations = {100.0, 100.25, 100.42, 100.3, 100.4, 100.50, 100.6, 100.7, 100.87, 100.91, 100.1000000};

    public void on() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    public void off() {
        if (isOn == true) {
            isOn = false;
            System.out.println("Radio is off");
        }
    }

    public void volumeUp() {
        if (isOn == true) {
            volume++;
            if (volume >= 100) {
                volume = 100;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    public void volumeDown() {
        if (isOn == true) {
            volume--;
            if (volume <= 0) {
                volume = 0;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    public void radioUp() {
        if (isOn == true) {
            currentStation++;
            if (currentStation >= radioStations.length) {
                currentStation = 0;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

    public void radioDown() {
        if (isOn == true) {
            currentStation--;
            if (currentStation <= 0) {
                currentStation = radioStations.length-1;
            }
            System.out.println("Radion station is " + radioStations[currentStation] + ", volume = " + volume);
        }
    }

}

