class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums[0];
        n++;
        int i=1;
        while(n<nums[nums.length-1]){
            if(n<nums[i]){
                list.add(n);
                n++;
            }else{
                n++;
                i++;
            }
        }
        return list;
    }
}