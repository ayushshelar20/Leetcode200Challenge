class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int p=0,n=1,i=0;
        int arr[]=new int[nums.length];
        while(i<nums.length){
            if(nums[i]<0){
                arr[n]=nums[i];
                n+=2;
            }else{
                arr[p]=nums[i];
                p+=2;
            }
            i++;
        }
     
        return arr;
    }
}