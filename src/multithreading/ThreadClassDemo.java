package multithreading;

public class ThreadClassDemo  extends Thread{

    public void run(){
        System.out.println("Inside run");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadClassDemo demo=new ThreadClassDemo();


        demo.setName("Demo thread");

        demo.start();//execute by thread
        sleep(3000);
        demo.join();
        System.out.println(demo.getName());//main thread
        demo.run();//execute by main thread

    }
}
