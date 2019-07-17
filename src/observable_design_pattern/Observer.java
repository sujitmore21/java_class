package observable_design_pattern;

import java.nio.channels.Channel;

public interface Observer {
    void update();

    void subscribeChannel(Channel ch);
}
