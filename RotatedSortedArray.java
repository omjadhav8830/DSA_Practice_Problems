class Solution {
    public static boolean check(int[] nums) {
        int cbreaks = 0;
        int n = nums.length;

        for(int i=0; i < n; i++){
            if(nums[i] > nums[(i+1) % n ]){
                cbreaks++;
            }
        }
        return cbreaks <= 1;
    }
    public static void main(String[] args){
        int[] nums = {2,2,2,3,1,2};
        boolean re = check(nums);
        System.out.println("The array is rotated sorted array : "+re);
    }
}
