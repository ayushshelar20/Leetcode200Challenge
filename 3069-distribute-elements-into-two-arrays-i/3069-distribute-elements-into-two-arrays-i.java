class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);
        
        int i=2;

        while(i<nums.length){

            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
            i++;
        }
        list1.addAll(list2);

        int arr[]=new int[list1.size()]; 

        for(int j=0;j<list1.size();j++){
            arr[j]=list1.get(j);
        }

        return arr;
    }
}