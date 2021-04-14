/*
*Created by Dipak Patel
*Java program for two instance and two static variables
*Calling variables to instance and static methods and than to main method
 */

public class Program4 {

    //instance variable declaration
    int a = 5;
    String  n1 = "Dipak";

    //Static variable declaration
    static int b = 10;
    static String n2 = "Viral";



//static method
    static void dec1(){

        //print statements
        Program4 ins = new Program4();//object created
        System.out.println(ins.a);// instance variable calling
        System.out.println(ins.n1);//instance variable calling
        System.out.println(b);//direct calling
        System.out.println(n2);//direct calling


    }

//instance method
         void dec2(){

        //print statements
        System.out.println(a);//direct calling
        System.out.println(n1);// direct calling
        System.out.println(Program4.b);//static variable calling with class
        System.out.println(Program4.n2);//static variable calling with class

    }



    //Main method
    public static void main(String[] args){

        //method calling
        dec1();// calling static method
        Program4 call = new Program4();//object created
        call.dec2();//calling instance method


    }


}
