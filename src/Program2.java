/* Created by Dipak Patel
Java program for calling static variables into static method and than into main method
 */

public class Program2 {

    // static variable declaration
    static int x = 10;
    static int y = 20;



    //static method
    static void call (){

    // Print statement
        //calling instance variables to print statement
        System.out.println(x);
        System.out.println(y);


    }


    //Main method
    public static void main(String[] args) {

        //calling static method
        Program2.call();

    }
}
