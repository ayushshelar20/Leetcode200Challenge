class Solution {
    public boolean search(int[] nums, int target) {
        
        int l=0,h=nums.length-1;

        while(l<=h){

            if(nums[l]==nums[h]){
                if(nums[l]==target)return true;
                l++;h--;
                continue;
            }
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]<=nums[h]){
                if(target>nums[mid] && nums[h]>=target){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }else{
                if(nums[l]<=target && target<nums[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
        }
        return false;
    }
}