/*
 *created by dipak patel
 * Java program to convert upper case sentence  to lower case sentence.
 */

import java.util.Locale;

public class Upper2LowerProgram19 {


    //static method
    static void m2() {

        String upper, lower;// variable declaration


        System.out.print("Enter upper case here =  ");//print statement
        upper = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        lower = upper.toLowerCase(Locale.ROOT);//lower case declaration
        System.out.print(lower);//print statement


    }

    //Main method
    public static void main(String[] args) {

        //calling static method
        m2();


    }
}
