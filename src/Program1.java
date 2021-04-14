/*Created by Dipak Patel
 *Java program for calling instance variables to instance method and calling instance method to main method
*/

public class Program1 {

    //Instance variable declaration
    int x = 10;
    int y = 20;


    // instance method
    void call(){

        //calling variables to print statement
        System.out.println(x);
        System.out.println(y);


    }


    // Main method
        public static void main(String[] args){

            Program1 INC = new Program1();
            INC.call();




        }







}
