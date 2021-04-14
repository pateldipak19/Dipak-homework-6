/*
* created by dipak patel
* Java program to add two binary numbers
 */


import java.util.Scanner;

public class BinaryNumbersProgram16 {

    static void m (){

        //local variable declaration
        int x,y,z;
        String first,second;
        Scanner binary = new Scanner(System.in);//scanner created

        //print statement
        System.out.print("Input first binary number: ");
        first = binary.nextLine();
        System.out.print("Input second binary number: ");
        second = binary.nextLine();
        System.out.println("");//spacing

        //converting binary number to decimal number
        int radix = 2;
        x = Integer.parseInt(first, radix);
        y = Integer.parseInt(second,radix);
        z = x+y;

        //converting decimal number to binary number
        System.out.println("Sum of two binary numbers: "+ Integer.toBinaryString(z));








    }


    //Main method
    public static void main(String[] args){

        //calling static method
        m();

    }


}
