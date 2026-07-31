class Solution {
    public int minimumPushes(String word) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        String s="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!map.containsKey(ch)){
                s+=ch;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=map.get(s.charAt(i));
        }
        int n=arr.length;
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
        int p1=0,p2=0,p3=0,p4=0;
    
        for(int i=0;i<Math.min(8,n);i++){
            p1+=arr[i];
        }
        if(n>7)for(int i=8;i<Math.min(16,n);i++){
            p2+=2*arr[i];
        }
        if(n>15)for(int i=16;i<Math.min(24,n);i++){
            p3+=3*arr[i];
        }
        if(n>23)for(int i=24;i<Math.min(32,n);i++){
            p4+=4*arr[i];
        }
        return p1+p2+p3+p4;
    }
}