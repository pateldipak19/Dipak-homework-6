/*
*created by dipak patel
* java program to calculate the area of a triangle
 */


import java.util.Scanner;

public class TriangleAreaProgram8 {

    void m1 (){

        double area, height, width; //variable declaration
        Scanner scan = new Scanner(System.in);//scanner created

        System.out.print("Enter the height of the Triangle = ");//print statement
        height = scan.nextDouble();

        System.out.print("Enter the width of the Triangle = ");//print statement
        width = scan.nextDouble();

        System.out.println("");//spacing

        area = (double) (height*width)/2;// formula declaration
        System.out.print("Triangle Area = "+area);//print statement



    }



    //main method
    public static void main(String[] args){


  // calling instance method
        TriangleAreaProgram8 TA = new TriangleAreaProgram8();// object created
        TA.m1();







    }


}
