/*
*created by dipak patel
* Java program to convert upper case to lower case.
 */


import java.util.Locale;
import java.util.Scanner;

public class Upper2LowerCaseProgram9 {

    //static method
    static void m2 (){

        String upper, lower;// variable declaration
        Scanner scan = new Scanner(System.in);//scanner created

        System.out.print("Enter upper case here =  ");//print statement
        upper = scan.nextLine();

        lower = upper.toLowerCase(Locale.ROOT);//lower case declaration
        System.out.print("Lower case for the entered upper case is = "+lower);//print statement






    }

    //Main method
    public static void main(String[] args){

        //calling static method
        m2();




    }


}
