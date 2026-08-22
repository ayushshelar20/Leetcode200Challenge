class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int i=0,j=nums.length-1;

        while(i<j){

            int h=Math.min(nums[i], nums[j]);
            int w=(j-i);

            max=Math.max(max,h*w);

            if(nums[i]<nums[j])i++;
            else j--;
        }
        return max;
    }
}