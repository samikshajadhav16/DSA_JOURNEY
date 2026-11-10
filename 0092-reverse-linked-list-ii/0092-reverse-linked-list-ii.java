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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head==null || left==right) return head;
       ListNode dummy = new ListNode(0);

       dummy.next=head;

       ListNode prev = dummy;
       ListNode curr = head;

       for(int i=0;i<left-1;i++)
       {
        prev = prev.next;
        curr = curr.next;
       }

       ListNode leftprev = curr;
       ListNode prev_temp = null;

       for(int i=0;i<=(right-left);i++)
       {
        ListNode temp_next = curr.next;
        curr.next = prev_temp;
        prev_temp = curr;
        curr = temp_next;
       }

       // 2 links
       leftprev.next = curr;
       prev.next = prev_temp;
    return dummy.next;
    }
}