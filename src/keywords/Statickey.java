package keywords;

import java.util.Scanner;

public class Statickey{

    /**The static keyword in Java is used for memory management mainly.
    We can apply java static keyword with variables, methods, blocks and nested class.
    The static keyword belongs to the class than an instance of the class.*/

        private static int count = 0;
        private static int size = 0;

        private int getCount() {
            System.out.println(size);
            return ++count;
        }

        public static void getData() {
            //System.out.println(count);
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println(name);
        }

static {
        System.out.println("Inside static block");
        }

public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
        Statickey staticKey = new Statickey();
        System.out.println(staticKey.getCount());
        }
        getData();
        }

}
