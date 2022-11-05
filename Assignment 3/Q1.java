import java.util.*;

public class Q1{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println(("Enter the 2 Strings : "));

        String str1 = scn.next();
        String str2 = scn.next();

        int comp_val = 0; // stores compared value

        // Start iterating and comparing characters at position same in both in string str1 and str2 
        // If unicode value of both the characters is same then continue otherwise make compared_value = (str1[i] - str2[i]) and break
        for (int i = 0; i < str1.length() && i < str2.length(); i++)
        {
            int val1 = str1.charAt(i);
            int val2 = str2.charAt(i);
            
            if (val1 != val2)
            {
                comp_val = val1 - val2;
                break;
            }
        }

        // If str2 is a substring of str1 or str1 is a substring of str2 then take compared_value = str1.length() - str2.length();
        if (comp_val == 0 && (str1.length() > str2.length() || str2.length() > str1.length())) {
            comp_val = str1.length() - str2.length();
        }

        // Printing the compared_value 
        System.out.println("Strings compared lexicographically return: " + comp_val);

        scn.close(); // closing the Scanner's object
    }
}