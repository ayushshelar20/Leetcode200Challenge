class Solution {
    public long[] sumOfThree(long num) {

        long mid=num/3-1;
        long nums[]=new long[3];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=mid;
            nums[i]=mid;
            mid++;
        }  

        if(sum==num)return nums;
        return new long[0];
    }
}