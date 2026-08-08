class Solution {
    public int[] plusOne(int[] nums) {
        
        int l=nums.length-1;
        int carry=0;
        while(l>-1){
            if(nums[l]+1<=9){
                nums[l]+=1;
                return nums;
            }else{
                nums[l]=0;
                carry=1;
                l--;
            }
        }
        if(carry==1){
            int arr[]=new int[nums.length+1];
            arr[0]=1;
            for(int i=0;i<nums.length;i++){
                arr[i+1]=nums[i];
            }
            return arr;
        }
        return nums;
    }
}