class Solution {
    public boolean checkDivisibility(int n) {
        
        int x=n;
        int sum=0,mul=1;
        while(x!=0){
            sum+=x%10;
            mul*=x%10;
            x/=10;
        }
        int finalSum=sum+mul;
        if(n%finalSum==0)return true;
        return false;
    }
}