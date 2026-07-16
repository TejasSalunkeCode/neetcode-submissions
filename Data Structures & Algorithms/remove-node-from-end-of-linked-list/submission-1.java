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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          if(head==null){
            return head;
        }
        if(head.next==null && n==1){
            return head.next;
        }
        ListNode curr=head;

        int length=0;
        while(curr!=null){
        length++;
        curr=curr.next;
        }

        int count=(length-n)+1;
        curr=head;
        ListNode prev=null;
        ListNode front=curr.next;
          if(count==1){
            return head.next;
        }
        while(count>1){
            prev=curr;
            curr=curr.next;
            front=curr.next;
            count--;
        }
      
        prev.next=front;
        return head;

    }}