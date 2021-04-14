/*
* Craeted by Dipak Patel
* Java program for finding area using any radius value of the circle
 */

import java.util.Scanner;

public class CircleAreaProgram6 {

    //instance method
    void circle (){

        //Variable declaration
        float area,radius;

        Scanner scan = new Scanner(System.in);// scanner created

        System.out.print("Enter radius value =  ");//print statement
        radius = scan.nextFloat();


        area = (float) (Math.PI * (radius * radius)); //formula declaration

        System.out.println("Area of circle = " + area); // print statement with calculation





    }

    // Main method
    public static void main(String[] args){

     // calling instance method
        CircleAreaProgram6 cir = new CircleAreaProgram6();
        cir.circle();


        }
    }








