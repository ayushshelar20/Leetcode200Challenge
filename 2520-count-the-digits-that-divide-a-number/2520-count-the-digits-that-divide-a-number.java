class Solution {
    public int countDigits(int num) {
       
        String snum=""+num;
        int cnt=0;
        for(int i=0;i<snum.length();i++){
            int nnum = snum.charAt(i) - '0';
            if(num%nnum==0)cnt++;
        }
        return cnt;
    }
}