/*
* created by dipak patel
* java program to convert fahrenheit temperature value to degree celsius
 */


import java.util.Scanner;

public class Fahrenheit2CelsiusProgram7 {

    static void m1(){

        int fahrenheit, celsius;// variable declaration
        Scanner scan = new Scanner(System.in);//scanner created

        System.out.print("Enter Degree Fahrenheit Value =  ");//print statement
        fahrenheit = scan.nextInt();

        celsius = (int)  (5*(fahrenheit-32)/9);// formula declaration

        System.out.println("");//spacing
        System.out.println("Degree Celsius = " + celsius);//print statement


    }

    //main method
    public static void main(String[] args){


       //calling static method

        m1();





    }











}
