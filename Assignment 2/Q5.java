import java.util.Scanner;

public class Q5
{
	public static void main(String[] args) {
	    
        Scanner scn = new Scanner(System.in);
        
	    System.out.println("Enter a number: ");
	    int n = scn.nextInt();

        System.out.println("n n^2 n^3 n^4");

        for(int i = 1 ; i <= n ; i++)
        {
            System.out.println(i + " " + Math.pow(i , 2) + " " + Math.pow(i , 3) + " " + Math.pow(i , 4));
        }
	}
}