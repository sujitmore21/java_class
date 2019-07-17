package observable_design_pattern;

public class Youtube {

    public static void main(String[] args)
    {
        Channel suji = new Channel();

        Observer s1 = new Subscriber("sujit");
        Observer s2 = new Subscriber("som");
        Observer s3 = new Subscriber("ram");
        Observer s4 = new Subscriber("sunil");
        Observer s5 = new Subscriber("ramesh");
        Observer s6 = new Subscriber("sumit");
        Observer s7 = new Subscriber("sam");

        suji.subscribe(s1);
        suji.subscribe(s2);
        suji.subscribe(s3);
        suji.subscribe(s4);
        suji.subscribe(s5);
        suji.subscribe(s6);
        suji.subscribe(s7);

        suji.unSubscribe(s3);

        s1.subscribeChannel(suji);
        s2.subscribeChannel(suji);
        s3.subscribeChannel(suji);
        s4.subscribeChannel(suji);
        s5.subscribeChannel(suji);
        s6.subscribeChannel(suji);
        s7.subscribeChannel(suji);

        suji.upload("How to learn programming ??");
    }
}
