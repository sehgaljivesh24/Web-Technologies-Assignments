import java.util.Scanner;

public class Q1
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Number: "); 
        double score = scn.nextInt();

        // If Statement
        if(score > 80 && score < 90)
        {
            score += 5;
        }

        System.out.println("Final Output : " + score);
	}
}