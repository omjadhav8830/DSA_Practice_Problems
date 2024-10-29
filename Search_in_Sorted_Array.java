//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int k = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.searchInSorted(arr, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static boolean searchInSorted(int arr[], int k) {
        // Your code here
         int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            if (arr[mid] == k) {
                return true; // Element found
            } else if (arr[mid] < k) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return false; // Element not found
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Example sorted input
        int k = 4; // Element to find
        boolean found = searchInSorted(arr, k);
        System.out.println("Is " + k + " present in the array? " + found);
    }
}
