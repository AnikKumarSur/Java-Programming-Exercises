/*3. Division of Two Numbers

Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16*/


import java.util.Scanner;

public class divisionOfTwoNumbers {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter The Second Number : ");
        int secondNumber = scanner.nextInt();
        int Division = firstNumber / secondNumber;

        System.out.println("The Division of " +firstNumber + " and " + secondNumber + " is : " + Division);
    }



}
