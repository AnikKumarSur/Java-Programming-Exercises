/*5. Product of Two Numbers

Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/


import java.util.Scanner;

public class productOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Input second number : ");
        int number2 = scanner.nextInt();
        int product = number1 * number2;
        System.out.println(number1 + " x " + number2 + " = " + product);

    }
}
