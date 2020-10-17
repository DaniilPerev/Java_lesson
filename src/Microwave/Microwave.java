package Microwave;

public class Microwave {
    private boolean isOn = false; // field
    private boolean isOpen = false;
    private int timer = 0;
    private String mode = "Manual";

    public void on() { //method
        isOn = true;
        System.out.println("Microwave if on");
    }

    public void off() {
        isOn = false;
        System.out.println("Microwave if off");
    }

    public void setTime(int min, int sec) {
        if (isOn == false) {
            return;
        }
        if (mode.equals("Manual")) {
           timer = (min * 60) + sec;
            System.out.println("Time set: " + timer + " sec");
        }
    }
    public void setMode(String mode) {
        if (isOn == false) {
            return;
        }
        this.mode = mode;
        if (mode.equals("Cup")) {
            timer = 70;
        }
        if (mode.equals("Plate")) {
            timer = 200;
        }
        System.out.println("Mode Set: " + mode);
    }
    public void doorOpen() {
       isOpen = true;
        System.out.println("Door is open");
    }
    public void doorShut() {
        isOpen = false;
        System.out.println("Door is shut");
    }
    public void start() {
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


