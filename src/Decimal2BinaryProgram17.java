/*
 * created by dipak patel
 * Java program to add two binary numbers
 */


import java.util.Scanner;

public class Decimal2BinaryProgram17 {

    //instance method
     void m (){

        //local variable declaration
        int Decimal;
        String binary;
        Scanner bin = new Scanner(System.in);//scanner created

        //print statement
        System.out.print("Input Decimal number: ");
        Decimal = bin.nextInt();

        System.out.println("");//spacing

        //converting decimal to binary
        binary = Integer.toBinaryString(Decimal);

        //converting decimal number to binary number
        System.out.println("Binary number is: "+ binary);








    }


    //Main method
    public static void main(String[] args){

         //calling instance method
        Decimal2BinaryProgram17 obj = new Decimal2BinaryProgram17();//object created
        obj.m();

    }


}


