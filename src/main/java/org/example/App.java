/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3, largest = 0;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3)  {
            System.out.println("Not all numbers were different.");
            System.exit(0);
        }

        if (num1 > num2)  {
            if (num1 > num3) {
                largest = num1;
            }
            else  {
                largest = num3;
            }
        }

        else if (num2 > num1) {
            if (num2 > num3) {
                largest = num2;
            }
            else{
                largest = num3;
            }
        }

        System.out.printf("The largest number is %d.", largest);

    }
}
