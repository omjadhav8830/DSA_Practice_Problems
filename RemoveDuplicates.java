class Solution {
    public static int removeDuplicates(int[] nums) {
        
        if(nums.length == 0)
        return 0;

        int i=0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }
    public static void main(String[] args){
        int[] nums = {1,1,2,2,3,4,4};
        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: "+k);
        System.out.println("Unique elements:");
        for(int i=0; i < k; i++){
            System.out.println(nums[i] + " ");
        }
    }
}
