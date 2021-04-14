/*
*created by dipak patel
* Java program for multiplication table
 */

import java.util.Scanner;

public class MultiplicationTableProgram10 {

    void m1 (){

        Scanner num = new Scanner(System.in);//scanner created
        System.out.print("Input a number = ");//print statement for input data
        int input = num.nextInt();


        int a = input*1;
        System.out.println(input + " X " + " 1 " + " = " +a);

        int b = input*2;
        System.out.println(input + " X " + " 2 " + " = " +b);

        int c = input*3;
        System.out.println(input + " X " + " 3 " + " = " +c);

        int d = input*4;
        System.out.println(input + " X " + " 4 " + " = " +d);

        int e = input*5;
        System.out.println(input + " X " + " 5 " + " = " +e);

        int f = input*6;
        System.out.println(input + " X " + " 6 " + " = " +f);

        int g = input*7;
        System.out.println(input + " X " + " 7 " + " = " +g);

        int h = input*8;
        System.out.println(input + " X " + " 8 " + " = " +h);

        int i = input*9;
        System.out.println(input + " X " + " 9 " + " = " +i);

        int j = input*10;
        System.out.println(input + " X " + " 10 " + " = " +j);




    }



    //Main method
    public static void main(String[] args){

        //calling instance method
        MultiplicationTableProgram10 table = new MultiplicationTableProgram10();
        table.m1();
    }



}
