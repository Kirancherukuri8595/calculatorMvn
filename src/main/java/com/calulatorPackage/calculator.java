package com.calulatorPackage;

import java.util.Scanner;

public class calculator {
    public  static void main(String[] args) {
//        Integer firstNumber;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the first number");
        Integer firstNumber = userInput.nextInt();
        System.out.println("Please enter the second number");
        Integer secondNumber = userInput.nextInt();
        System.out.println("Please enter an operator '+' or '-' or '*' or '/' or '%' ");
        char operator = userInput.next().charAt(0);
        calculator(firstNumber,secondNumber,operator);
    }

    public  static Integer add(Integer a, Integer b){
        return a+b;
    }

    public static Integer subtraction(Integer a, Integer b){
        return a-b;
    }

    public static Integer product(Integer a, Integer b){
        return a*b;
    }

    public static Integer division(Integer a, Integer b){
        return a/b;
    }

    public static Integer remainder(Integer a, Integer b){
        return a%b;
    }

    public static void calculator(Integer first, Integer second, char c){
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
