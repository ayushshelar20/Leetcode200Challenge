class Solution {
    public int lengthOfLastWord(String s) {
        
        int l=s.length()-1,cnt=0;
        while(l>=0){
            if(s.charAt(l)!=' '){
                cnt++;
            }else{
                if(cnt!=0){
                    return cnt;
                }
            }
            l--;
        }
        return cnt;
    }
}