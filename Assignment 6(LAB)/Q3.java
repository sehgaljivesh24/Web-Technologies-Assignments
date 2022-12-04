import java.util.*;

class Calculator {
    private int num1;
    private int num2;

    public Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int addition() {
        int ans = num1 + num2;
        System.out.println("Addition is : " + ans);
        return ans;
    }

    public int subtraction() {
        int ans = num1 - num2;
        System.out.println("Subtraction is : " + ans);
        return ans;
    }

    public double division() {
        double ans = (double) num1 / num2; // division of num1 and num2
        System.out.println("Division is : " + ans);
        return ans;
    }

    public int multiply() {
        int ans = num1 * num2;
        System.out.println("Multiplication is : " + ans);
        return ans;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("Enter the first number : ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Enter the second number : ");
            num2 = Integer.parseInt(sc.nextLine());
            Calculator obj1 = new Calculator(num1, num2);
            Calculator obj2 = new Calculator(num1, num2);
            Calculator obj3 = new Calculator(num1, num2);
            Calculator obj4 = new Calculator(num1, num2);
            obj1.addition();
            obj2.subtraction();
            obj3.multiply();
            obj4.division();
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input " + e);
        }

        sc.close();
    }

}