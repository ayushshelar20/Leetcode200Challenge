class Solution {
    public int smallestNumber(int n, int t) {

        while(n<=100 ){
            int x=n,pro=1,ans=n;
            while(x!=0){
                pro*=x%10;
                x/=10;
            }
            if(pro%t==0)return ans;
            n++;
        }
        return n;
    }
}