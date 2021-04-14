/*
* created by dipak patel
* Java program to compute the specified expressions and print
 */

public class SpecExpressionsProgram12 {

    //variable declarations

    double  a=25.5,b=3.5,c=40.5,d=4.5;

    //instance method
    void m1(){

        //print statement
        System.out.println((a*b-b*b)/(c-d));


    }

    //main method
    public static void main(String[] args){

        //calling instance method
        SpecExpressionsProgram12 obj = new SpecExpressionsProgram12();
        obj.m1();

    }




}
