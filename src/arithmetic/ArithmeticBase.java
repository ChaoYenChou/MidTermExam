/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 private double x,y;
 public enum Operations {PLUS,MINUS,TIMES,DIVIDE};
 private Operations operations;
    double calculate(double x, double y) 
        {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: Enter 1 for plus, 2 for minus, 3 for times, 4 for divide");
        int s= sc.nextInt();
        if(s==1){
            operations = Operations.PLUS;
        }
        else if(s==2){
            operations = Operations.MINUS;
        }
        else if(s==3){
            operations = Operations.TIMES;
        }
        else if(s==4){
            operations = Operations.DIVIDE;
        }
        switch (operations) 
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
