package observable_design_pattern;

public interface Subject {
    void subscribe(Object sub);

    void unSubscribe(Object sub);

    void notifySubscribers();

    void upload(String title);
}
