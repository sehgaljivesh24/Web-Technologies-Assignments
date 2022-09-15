public class Assignment1 {

    // 1. Write a Java program to print addition and subtraction of two integer
    // numbers.
    public static void Q1() {

        int num1 = 237;
        int num2 = 589;

        int sum = num1 + num2;
        int diff = num1 - num2;

        System.out.println("Question 1");
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("Difference of " + num1 + " and " + num2 + " is " + diff);
    }

    // 2. Write a Java program to print multiplication of two floating point
    // numbers.
    public static void Q2() {

        float num1 = 6.25f;
        float num2 = 9.125f;

        float answer = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " gives " + answer);
    }

    // 3. Write a Java program to compute quotient and remainder and print it.
    public static void Q3() {
        int dividend = 576;
        int divisor = 37;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient when " + dividend + " is divided by " + divisor + " is " + quotient);
        System.out.println("Remainder when " + dividend + " is divided by " + divisor + " is " + remainder);
    }

    // 4. Write a Java program to swap the values of integer number
    // with using temporary variable and without using temporary variable
    public static void Q4() {

        int num1 = 981;
        int num2 = 119;

        // num1 and num2 swapped using temp variable
        System.out.println("Before Swapping using temp :- " + "num1: " + num1 + " and num2: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping using temp :- " + "num1: " + num1 + " and num2: " + num2);

        // num1 and num2 swapped without using temp variable
        System.out.println("\nBefore Swapping without using temp :- " + "num1: " + num1 + " and num2: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping without using temp :- " + "num1: " + num1 + " and num2: " + num2);
    }

    public static void main(String[] args) {
        System.out.println();
        Q1();
        System.out.println();
        Q2();
        System.out.println();
        Q3();
        System.out.println();
        Q4();
    }
}