import java.util.*;

public class Q3 {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the String : ");
        
        String str= scn.nextLine();
        scn.close();

        char[] array = str.toCharArray();
        Arrays.sort(array);
        str = new String(array);

        System.out.println("Sorted string is: " + str);
    }
}
