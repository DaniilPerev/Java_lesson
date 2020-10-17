package Radio;

public class Main {
    public static void main(String[] args) {
        Radio carRadio = new Radio();
        carRadio.on();
        carRadio.volumeUp();
        carRadio.radioDown();
        carRadio.radioUp();
        carRadio.radioUp();
        carRadio.off();
        carRadio.volumeDown();
        carRadio.on();
        carRadio.volumeDown();
    }
}
