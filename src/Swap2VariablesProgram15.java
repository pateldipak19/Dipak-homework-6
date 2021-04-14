/*
* created by dipak patel
* Java program to swap two variables
 */
import java.util.Scanner;

public class Swap2VariablesProgram15 {

    //instance method
    void m1 (){

        // variable declaration
        int a, b, c;
        Scanner in = new Scanner(System.in);//scanner created


        //print statements
        System.out.print("Input 1st number: ");
        a = in.nextInt();
        System.out.print("Input 2nd number: ");
        b = in.nextInt();

        //Swapping declaration
        c = a;
        a = b;
        b = c;

        System.out.println(" Swapped numbers 2nd to 1st = " + a + " and " + b);//print statement


    }

    //main method
    public static void main (String[] args){

        Swap2VariablesProgram15 swap = new Swap2VariablesProgram15();//object created
        swap.m1();//calling instance method


    }



}
