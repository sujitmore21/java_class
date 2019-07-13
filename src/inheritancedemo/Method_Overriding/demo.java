package inheritancedemo.Method_Overriding;

public class demo extends ParentClass {

    demo(){
    System.out.println("Constructor of Child");
}
    void disp(){
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.disp();
    }
    public static void main(String args[]){
        //Creating the object of child class
        demo obj = new demo();
        obj.disp();
    }
}