package Blender;

public class Blender {
    private boolean isOn = false;
    private int blenderSpeed = 0;
    private int maxSpeed;
    private boolean isCupOn = true;

    public Blender(int maxSpeed) {
        this.maxSpeed = maxSpeed;
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

        if (isOn == true) {
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
