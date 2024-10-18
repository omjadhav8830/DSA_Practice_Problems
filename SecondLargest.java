class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length < 2){
            return -1;
        }
        
        //initialization
        int la = Integer.MIN_VALUE;
        int sla = Integer.MIN_VALUE;
        
        //Traverse the array
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > la){
                sla = la;
                la = arr[i];
            }
            else if(arr[i] > sla && arr[i] != la){
                sla = arr[i];
            }
        }
        
       return (sla == Integer.MIN_VALUE) ? -1 : sla;

        
    }
    
    public static void main(String[] args){
        
        int[] arr = {12,35,1,10,34,1};
        
        int res = getSecondLargest(arr);
        System.out.println("The second largest element is : " + res);
    }
}
