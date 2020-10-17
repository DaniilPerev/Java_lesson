package TV;

import Blender.Blender;

public class TV {
    private boolean isOn = false;
    private int volume = 0;
    private int channels = 1;
    private int maxChannels;

    public TV(int maxChannels) {
        this.maxChannels = maxChannels;
    }

    public void on() {
        isOn = true;
        System.out.println("TV is on, channel " + channels + " volume " + volume);
    }

    public void off() {
        isOn = false;
        System.out.println("TV is off");
    }

    public void volumeUp() {
        if (isOn == true) {
            volume++;
            if (volume >= 100) {
                volume = 100;
            }
            System.out.println("Volume is " + volume + " channel is "+ channels);
        }
    }
    public void volumeDown() {
        if (isOn == true) {
            volume--;
            if (volume <= 0) {
                volume = 0;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }
    public void channelUp() {
        if (isOn == true) {
            channels++;
            if (channels > maxChannels) {
                channels = 1;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }
    public void channelDown() {
        if (isOn == true) {
            channels--;
            if (channels < 1) {
                channels = maxChannels;
            }
            System.out.println("Volume is " + volume + " channel is " + channels);
        }
    }
    public void channelSet(int channels) {
        if (isOn == true) {
          if (channels >= 1 && channels <= maxChannels) {
              this.channels = channels;
              System.out.println("Volume is " + volume + " channel is " + channels);
          }
        }
    }
}
