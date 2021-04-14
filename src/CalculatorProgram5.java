/*
created by Dipak Patel
Java program for calculator with addition,subtraction,multiplication and division
 */

import java.util.Scanner;//scanner imported

public class CalculatorProgram5 {


//instance method
    void m1(){


        float first1, second1,add,subtract;// variable declaration
        Scanner scan1 = new Scanner(System.in);//scanner created

      //print statements
        System.out.print("Enter 1st number: ");
        first1 = scan1.nextInt();
        System.out.print("Enter 2nd number: ");
        second1 = scan1.nextInt();

        //declaring calculations
        add = first1 + second1;
        subtract = first1 - second1;

        //print statement
        System.out.println("");//spacing
        System.out.println("Sum =" + add);
        System.out.println("Difference =" + subtract);
    }



//static method

    static void m2(){


        float first2,second2,multiply,divide;//variable declaration
        Scanner scan2 = new Scanner(System.in);// scanner created

        //print statement
        System.out.print("Enter 1st number: ");
        first2 = scan2.nextInt();
        System.out.print("Enter 2nd number: ");
        second2 = scan2.nextInt();

        //declaring calculations
        multiply = first2 * second2;
        divide = first2 / second2;

        //print statements
        System.out.println("");//spacing
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);

    }


    //Main method

    public static void main (String[] args){

        System.out.println("");//spacing
        CalculatorProgram5 obj = new CalculatorProgram5();//object created
        obj.m1();//calling instance method
        System.out.println("");//spacing
        m2();//calling static method




    }

}
