class Solution {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // XOR all elements
        }

        return result; // The single number that remains
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // Example input
        int single = singleNumber(nums);
        System.out.println("The single number is: " + single);
    }
}
