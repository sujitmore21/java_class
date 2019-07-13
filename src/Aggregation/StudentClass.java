package Aggregation;

public class StudentClass {

    int rollNum;
    String studentName;

    //creating HAS-A relationship with Address class

    Address studentAddr;

    StudentClass(int roll,String name,Address addr){
        this.rollNum=roll;
        this.studentName=name;
        this.studentAddr=addr;
    }

    public static void main(String[] args) {
        Address ad = new Address(55,"pune","MH","India");
        StudentClass obj = new StudentClass(12,"Rohan",ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}
