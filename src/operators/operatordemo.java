package operators;

public class operatordemo {

    public static void main(String[] args){

        int a= 10;
        int b= 20;
        int c=(++a)+(b++);
        int d=(++c)+(b++)+(++a);
        int e=(++c)+(b++)+(++a)+(d++);

        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);



    }
}
