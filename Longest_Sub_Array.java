// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int lenOfLongestSubarr(int[] arr, int k) {
     
        // code here
         HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int cumulativeSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            // Check if the cumulative sum equals k
            if (cumulativeSum == k) {
                maxLength = i + 1; // Subarray from index 0 to i
            }

            // Check if (cumulativeSum - k) exists in the map
            if (sumIndexMap.containsKey(cumulativeSum - k)) {
                int length = i - sumIndexMap.get(cumulativeSum - k);
                maxLength = Math.max(maxLength, length);
            }

            // Store the cumulative sum with its index if not already present
            sumIndexMap.putIfAbsent(cumulativeSum, i);
        }

        return maxLength; // Return the maximum length found
    }
      public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3}; // Example input
        int k = 3; // Desired sum
        int length = lenOfLongestSubarr(arr, k);
        System.out.println("Length of the longest subarray with sum " + k + ": " + length);
    }
}
