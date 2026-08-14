class Solution {
    public int maximumLengthSubstring(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,max=0;
        while(i<s.length()){
            char ch=s.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>2){
                char p=s.charAt(j);
                map.put(p,map.get(p)-1);
                j++;
            }
            max=Math.max(max,i-j+1);
            i++;
        }
        return max;
    }
}