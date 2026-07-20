class Solution {
    public int minElement(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                sum+=nums[i]%10;
                nums[i]/=10;
            }
            min=Math.min(min,sum);
        }
      
        return min;
    }
}