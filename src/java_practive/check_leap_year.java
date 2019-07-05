package java_practive;

import java.util.Scanner;

public class check_leap_year {

//    public static void main(String[] args) {
//    //year to leap year or not
//    int year = 2019;
//    System.out.println();
//    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
//        System.out.println("Year " + year + " is a leap year");
//    else
//        System.out.println("Year " + year + " is not a leap year");
//    System.out.println();
//}
    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

