package TV;

public class Main {
    public static void main(String[] args) {
        TV sumsung = new TV(100);
       sumsung.on();
       sumsung.volumeUp();
       sumsung.channelDown();
       sumsung.channelUp();
       sumsung.channelSet(13);
       sumsung.off();
    }
}

