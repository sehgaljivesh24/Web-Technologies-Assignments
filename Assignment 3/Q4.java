import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = scn.nextInt();

        System.out.print("Hailstone Sequence for " + num + " is: ");

        // While n is not equal to 1 check if n is even, if yes then reduce it by half otherwise increment by multiplying it by three and adding one at each iteration print n
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }

            System.out.print(num + " ");
        }

        scn.close(); // Closing Scanner's object
    }
}
