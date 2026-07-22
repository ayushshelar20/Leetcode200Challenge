class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i=0,l=0,r=0;
        while(r!=nums.length){
            if(nums[l]!=nums[r]){
                nums[i]=nums[l];
                i++;
                l=r;
            }
            r++;
        }
        nums[i]=nums[r-1];
        return i+1;
    }
}