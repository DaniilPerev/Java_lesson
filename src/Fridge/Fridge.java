package Fridge;

public class Fridge {
    private boolean isOn = false;
    private boolean isDoorOpen = false;
    private boolean lampOn = false;

    public void on() {
        isOn = true;
        System.out.println("Fridge is on");
        if (isDoorOpen == true) {
            lampOn = true;
            System.out.println("Lamp is on");
        }

    }

    public void off() {
        isOn = false;
        System.out.println("fridge is off");
        lampOn = false;
        if (isDoorOpen == true) {
            lampOn = false;
            System.out.println("Lamp is off");
        }
    }
    public void openDoor () {
        isDoorOpen = true;
        System.out.println("Door is open");
        if (isOn == true) {
            lampOn = true;
            System.out.println("Lamp is on");
        }


    }
    public void closeDoor () {
        isDoorOpen = false;
        System.out.println("Door is closed");
        if (isOn == true) {
            lampOn = false;
            System.out.println("Lamp is off");
        }
    }
}
