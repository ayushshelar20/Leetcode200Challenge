class Solution {
    public void rotate(int[] nums, int k) {
        
        k=k%nums.length;
        int i=0;int arr[]=new int[nums.length];
        while(i!=nums.length){
            arr[i]=nums[(nums.length-k+i)%nums.length];
            i++;
        }
        for(int j=0;j<nums.length;j++)
        nums[j]=arr[j];
    }
}