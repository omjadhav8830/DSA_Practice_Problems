class Solution {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expsum = n * (n + 1)/2;
        int actsum = 0;

        for(int num:nums){
            actsum += num;
        }
        return expsum - actsum;
    }
    public static void main(String[] args){
        int[] nums = {3,0,1};
        int m = missingNumber(nums);
        System.out.println("The missing number is :" +m);
    }
}
