/*6. Basic Arithmetic Operations

Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/


import java.util.Scanner;

public class basicArithmaticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input second Number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Expected Output : ");
        int sum = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;
        System.out.println(firstNumber +" + "+ secondNumber + " = " + sum);
        System.out.println(firstNumber +" - "+ secondNumber + " = " + subtract);
        System.out.println(firstNumber +" x "+ secondNumber + " = " + multiply);
        System.out.println(firstNumber +" / "+ secondNumber + " = " + divide);
        System.out.println(firstNumber +" mod "+ secondNumber + " = " + mod);


    }
}
