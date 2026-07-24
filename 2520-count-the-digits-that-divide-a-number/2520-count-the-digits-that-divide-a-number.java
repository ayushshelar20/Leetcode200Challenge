class Solution {
    public int countDigits(int numm) {
        int num=numm; 
        int del=0,cnt=0;
        while(num!=0){
            int rem=num%10;
            if(numm%rem==0)cnt++;
            num/=10;
        }
        return cnt;
    }
}