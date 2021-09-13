/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        String firstNumber = input.next();
        System.out.println("What is the second number?");
        String secondNumber = input.next();

        int FirstNumber = Integer.parseInt(firstNumber);
        int SecondNumber = Integer.parseInt(secondNumber);

        //calculate sum
        int sum=FirstNumber+SecondNumber;

        //calculate difference
        int difference = FirstNumber-SecondNumber;

        //calculate product
        int product = FirstNumber*SecondNumber;

        //calculate quotient
        int quotient = FirstNumber/SecondNumber;

        System.out.println(FirstNumber+ "+"+SecondNumber+ "="+sum);
        System.out.println(FirstNumber+ "-"+SecondNumber+ "="+difference);
        System.out.println(FirstNumber+ "*"+SecondNumber+ "="+product);
        System.out.println(FirstNumber+ "/"+SecondNumber+ "="+quotient);

    }
}
