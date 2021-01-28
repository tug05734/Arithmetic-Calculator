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
            System.out.print("\nInput first number (Must be whole number): ");
            number1 = in.nextInt();
            System.out.print("\nInput second number (Must be whole number): ");
            number2 = in.nextInt();
            
            switch (operation){
                case 1:
                    System.out.println("\nAnswer: " + add(number1, number2));
                    stillRunning = advance();
                    break;
                case 2: 
                    System.out.println("\nAnswer: " + subtract(number1, number2));
                    stillRunning = advance();
                    break;
                case 3:
                    System.out.println("\nAnswer: " + multiply(number1, number2));
                    stillRunning = advance();
                    break;
                case 4:
                    System.out.println("\nAnswer: " + divide(number1, number2));
                    stillRunning = advance();
                    break;
                default:
                    System.out.println("\nIncorrect operation input, program terminated.");
                    stillRunning = false;
            }
        }    
    }
    
    static int add(int x, int y){
        return x + y;
    }
    
    final static int subtract(int x, int y){
        return x - y;
    }
    
    private static int multiply(int x , int y){
        return x * y;
    }
    
    static double divide(int x, int y){
        return (double)x / y;
    }
    
    static boolean advance(){
        System.out.print("\nWould you like to do another operation? (Y or N) ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            return true;
        } else if (answer.equalsIgnoreCase("N")){
            System.out.println("Program Terminated.");
            return false;
        } else { 
            System.out.println("\nIncorrect input, program terminated.");
            return false;
        }
    }
}    
