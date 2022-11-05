import java.util.*;

public class Q2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = scn.nextInt(); // size of array

        int[] arr = new int[n]; // declaring & initializing an Array

        int[] cnt = new int[21]; // each index stores the count of each number(represented b) that occurs in
                                 // Array : arr

        // Taking input of array
        System.out.println("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            cnt[arr[i]]++; 
        }

        // Modify the count array such that each element at each index stores the sum of previous counts
        for (int i = 1; i < 21; i++) {
            cnt[i] += cnt[i - 1];
        }

        int k = n - 1;
        int sortedArray[] = new int[n];

        // Iterate Array arr and copy the element i at its correct position cnt[arr[k]] - 1 according to count array in sortedArray 
        // After placing each element at its correct position, decrease its count by one.
        while (k >= 0) {
            sortedArray[cnt[arr[k]] - 1] = arr[k];
            cnt[arr[k]] -= 1;
            k -= 1;
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        scn.close(); // closing Scanner's object
    }
}
