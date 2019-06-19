package stringdemo;

public class stringbufferdemo {

    public  static void main(String[] args){

        StringBuffer buffer=new StringBuffer("codekul");
        buffer.append("Institute");
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("Melayer");
        builder.append("Software");
        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}
