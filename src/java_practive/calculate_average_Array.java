package java_practive;

import java.util.Scanner;

public class calculate_average_Array {

    /*public static void main(String[] args) {
            double[] arr = {19, 12.89, 16.5, 200, 13.7};
            double total = 0;

            for(int i=0; i<arr.length; i++){
                total = total + arr[i];
            }


            *//* arr.length returns the number of elements
             * present in the array
             *//*
            double average = total / arr.length;

            *//* This is used for displaying the formatted output
             * if you give %.4f then the output would have 4 digits
             * after decimal point.
             *//*
            System.out.format("The average is: %.3f", average);
        }*/

    public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        /* Declaring array of n elements, the value
         * of n is provided by the user
         */
        double[] arr = new double[n];
        double total = 0;

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Element No."+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }



        double average = total / arr.length;

        System.out.format("The average is: %.3f", average);
    }

}
