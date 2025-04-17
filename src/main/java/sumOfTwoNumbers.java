/*2. Sum of Two Numbers

Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110*/

import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int SecondNumber = scanner.nextInt();
        int sum = firstNumber + SecondNumber;
        System.out.println("The sum of " + firstNumber + " and " + SecondNumber + " is : " + sum);
    }
}
