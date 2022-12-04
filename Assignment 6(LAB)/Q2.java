
import java.util.Scanner;

public class Q2 {

    public static void addition(int num1, int num2) {
        if (num1 < 0 || num2 < 0) { // if num1 or num2 are negative then it throws an arithmetic exception
            throw new ArithmeticException("Invalid input!! Negative numbers are not allowed");
        } else {
            int ans = num1 + num2; // addition of num1 and num2
            System.out.println("Addition is : " + ans);
        }
    }

    public static void subtraction(int num1, int num2) {
        if (num1 < 0 || num2 < 0) { // if num1 or num2 are negative then it throws an arithmetic exception
            throw new ArithmeticException("Invalid input!! Negative numbers are not allowed");
        } else {
            int ans = num1 - num2; // subtraction of num1 and num2
            System.out.println("Subtraction is : " + ans);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scn.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = scn.nextInt();

        try {
            addition(num1, num2);
        }
        catch(ArithmeticException e) { 
            System.out.println(e);
        }
        
        try {
            subtraction(num1, num2);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        
        scn.close();
    }
}