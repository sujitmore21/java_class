package oops.polymorphism.inheritancedemo;

public class PhysicsTeacher extends Teacher {

       String mainSubject = "Physics";
      public static void main(String args[]){
//        PhysicsTeacher obj = new PhysicsTeacher();
//        System.out.println(obj.collegeName);
//        System.out.println(obj.designation);
//        System.out.println(obj.mainSubject);
//        obj.does();


          PhysicsTeacher obj = new PhysicsTeacher();
          System.out.println(obj.getCollegeName());
          System.out.println(obj.getDesignation());
          System.out.println(obj.mainSubject);
          obj.does();

   }
}
