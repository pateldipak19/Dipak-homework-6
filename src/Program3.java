/*
Created by Dipak Patel
Java program for static and instance variables to instance and static method and than to main method
 */

public class Program3 {

    //instance variable declaration

    int x = 20;

    //static variable declaration

    static int y = 30;


 // static method
 static void call1 (){

     Program3 ins = new Program3();//object created for instance variable
    //print statement
     System.out.println(ins.x);
     System.out.println(y);// calling direct
 }

 // instance method
     void call2(){

     // print statement
         System.out.println(Program3.y);// calling static variable with class
         System.out.println(x);// direct calling


 }

//Main method
    public static void main(String[] args){


     // methods calling
     call1();//calling static method
     Program3 obj = new Program3();//object created
     obj.call2();//calling instance method







    }



}
