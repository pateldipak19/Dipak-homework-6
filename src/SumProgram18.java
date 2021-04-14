/*
* created by dipak patel
* Java program to print the sum , multiply, subtract, divide and  remainder of two numbers
 */

import java.util.Scanner;

public class SumProgram18 {

    //instance method
    void m1 (){

        //variable declaration
        int first, second, a, m ,s, d, r;

        Scanner sum = new Scanner(System.in);//Scanner created

        //print statement
        System.out.print("Input first number: " );
        first=sum.nextInt();
        System.out.print("Input second number: " );
        second = sum.nextInt();

        a = first + second;
        System.out.println(first + " + "+ second+" = "+ a );

        s = first-second;
        System.out.println(first + " - "+ second+" = "+ s );

        m = first*second;
        System.out.println(first + " x "+ second+" = "+ m );

        d = first/second;
        System.out.println(first + " / "+ second+" = "+ d );

        r = first%second;
        System.out.println(first + " mod "+ second+ " = "+r );



    }

// Main method
    public static void main(String[] args){

        SumProgram18 call =new SumProgram18();//object created
        call.m1();





    }
}
