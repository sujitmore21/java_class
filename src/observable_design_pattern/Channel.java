package observable_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Object> subs = new ArrayList<>();
    String title;

    @Override
    public void subscribe(Object sub)
    {
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Object sub)
    {
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers()
    {
        for(Observer sub : subs)
        {
            sub.update();
        }
    }
    @Override
    public void upload(String title)
    {
        this.title = title;
        notifySubscribers();
    }
}
