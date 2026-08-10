/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        ListNode pre=head;
        List<Integer> list=new ArrayList<>();
        while(pre!=null){
            list.add(pre.val);
            pre=pre.next;
        }
        Collections.sort(list);

        pre=head;
        int i=0;
        while(pre!=null){
            pre.val=list.get(i);
            i++;
            pre=pre.next;
        }
        return head;
    }
}