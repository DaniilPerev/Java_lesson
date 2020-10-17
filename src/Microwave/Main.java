package Microwave;

public class Main {
    public static void main(String[] args) {
       Microwave micro = new Microwave();
       micro.on();
       micro.setMode("Manual");
       micro.setTime(1, 30);
       micro.start();
       micro.setMode("Cup");
       micro.start();
       micro.doorOpen();
       micro.setMode("Plate");
       micro.start();
    }
}
