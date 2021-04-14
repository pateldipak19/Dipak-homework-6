/*
* created by dipak patel
* Java program for calculation of three input numbers average
 */


import java.util.Scanner;

public class NumberAvarageProgram13 {


    static void m (){

        //variable declaration
        float first, second, third, average;
        Scanner scan = new Scanner(System.in);//scanner created

        //print statement
        System.out.print("Input first number  =  ");
        first = scan.nextFloat();
        System.out.print("Input second number =  ");
        second = scan.nextFloat();
        System.out.print("Input third number  =  ");
        third = scan.nextFloat();

        average = (first + second + third)/3; // formula declaration
        System.out.println("Average number = "+average);


    }

     //main method
        public static void main(String[] args){


        m();




    }






}
