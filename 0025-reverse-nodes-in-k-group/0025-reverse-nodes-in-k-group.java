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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode back=dummy;
        ListNode front=head;
        for(int i=0;i<n/k;i++){
            int grp=0;
            ListNode pre=back;
            ListNode curr=front;
            ListNode fix=curr;
            while(grp<k){
                ListNode next=curr.next;
    
                curr.next=pre;
                pre=curr;
                curr=next;
                grp++;
            }
            back.next=pre;
            fix.next=curr;

            back=fix;
            front=curr;
            
        }

        return dummy.next;
    }
}