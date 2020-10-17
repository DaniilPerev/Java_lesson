package car;

public class Car {
    private boolean isOn = false;
    private int maxSpeed;
    private int speed = 0;
    private int minSpeed;

    public Car(int maxSpeed, int minSpeed) {
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;

    }

    public void on() {
        if (isOn == false) {
            isOn = true;
            System.out.println("Car is on");
        }
    }

    public void off() {
        if (isOn == true) {
            isOn = false;
            System.out.println("Car is off");
        }
    }

    public void speedUp(int speed) {
        if (isOn == true) {
            this.speed = this.speed + speed;
            if (this.speed > maxSpeed) {
                this.speed = maxSpeed;
            }
            System.out.println("Car speed is " + this.speed);
        }
    }

    public void speedDown(int speed) {
        if (isOn == true) {
           this.speed = this.speed + speed;
           if (this.speed < minSpeed) {
               this.speed = minSpeed;
           }
            System.out.println("Car speed is " + this.speed);
        }
    }

}


