/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Rajat
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    static boolean stillRunning = true;
    static int number1, number2, operation;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        while(stillRunning){
            System.out.print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nPlease input the number of the operation you would like to do: ");
            operation = in.nextInt();
            System.out.print("\nInput first number: ");
            number1 = in.nextInt();
            System.out.print("\nInput second number: ");
            number2 = in.nextInt();
            
            switch (operation){
                case 1:
                    add(number1, number2);
                    break;
                case 2: 
                    subtract(number1, number2);
                    break;
                case 3:
                    multiply(number1, number2);
                    break;
                case 4:
                    divide(number1, number2);
                    break;
                default:
                    System.out.println("\nIncorrect operation input");
                    stillRunning = false;
            }
        }    
    }
    
    private static int add(int x, int y){
        return  x + y;
    }
    
    final static int subtract(int x, int y){
        return x - y;
    }
    
    private static int multiply(int x , int y){
        return x * y;
    }
    
    static double divide(int x, int y){
        return x / y;
    }
    
    
}
