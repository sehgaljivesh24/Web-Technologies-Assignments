import java.util.Scanner;
import java.util.Vector;

public class Q1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        System.out.println("Enter the Elements : ");
        int num = scn.nextInt(); // Initial Input 

        // User can input Numbers as much it wants 
        // If User wants to stop entering no's in Vector
        // It will Type -> " -1 ""
        while(num != -1){
            v.addElement(num);
            num = scn.nextInt();
        }
        
        scn.close(); // Closing Scanner's Object

        System.out.print("Displaying vector values : ");

        for (int i = 0; i < v.size(); i++) {
            System.out.print (v.elementAt(i) + " ");
        }
    }
}