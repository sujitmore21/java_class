package observable_design_pattern;

import java.nio.channels.Channel;

public class Subscriber implements Observer {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update()
    {
        System.out.println("Hey" + name + ",Video Uploaded: " + channel);
    }

    @Override
    public void subscribeChannel(Channel ch)
    {
        channel = ch;
    }
}
