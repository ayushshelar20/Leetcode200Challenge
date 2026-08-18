class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        if(k==1){
            int max=-1;
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])<2){
                    max=Math.max(max,nums[i]);
                }
            }
            return max;
        }
        else if(k==nums.length){
            int max=-1;
            for(int i=0;i<nums.length;i++){   
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        else{
            int l=nums[0],r=nums[nums.length-1];

            if(l<r && map.get(r)<2){
                return r;
            }else if(map.get(l)<2){
                return l;
            }
            if(l>r && map.get(l)<2){
                return l;
            }else if(map.get(r)<2){
                return r;
            }
        }
        return -1;
    }
}