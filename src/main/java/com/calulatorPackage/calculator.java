package com.calulatorPackage;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double firstNumber = userInput.nextDouble();
        System.out.println("Please enter the second number");
        double secondNumber = userInput.nextDouble();
        System.out.println("Please enter an operator '+' or '-' or '*' or '/' or '%' ");
        char operator = userInput.next().charAt(0);
        calculator(firstNumber,secondNumber,operator);
    }

    static double add(double a, double b){
        return a+b;
    }

    static double subtraction(double a, double b){
        return a-b;
    }

    static double product(double a, double b){
        return a*b;
    }

    static double division(double a, double b){
        return a/b;
    }

    static double remainder(double a, double b){
        return a%b;
    }

    static void calculator(double first, double second, char c){
        switch (c){

            case '+':
                System.out.println("Addition of given numbers is :" + add(first, second));
                break;
            case '-':
                System.out.println("Balance of given numbers is :" + subtraction(first, second));
                break;
            case '*':
                System.out.println("Product of given numbers is :" + product(first, second));
                break;
            case '/':
                System.out.println("Division of given numbers is :" + division(first, second));
                break;
            case '%':
                System.out.println("Remainder of given numbers is :" + remainder(first, second));
                break;
            default:
                System.out.println("You have not entered a proper operator.");
        }
    }
}
