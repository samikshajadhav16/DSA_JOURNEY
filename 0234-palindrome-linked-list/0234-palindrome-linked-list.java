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
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null,next = null,curr = head;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
    return prev;
    }

    public boolean isIdentical(ListNode head1,ListNode head2)
    {
        while(head2!=null)
        {
            if(head1.val != head2.val) return false;
            head1 = head1.next;
            head2 = head2.next;
        }
    return true;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode slow = head , fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = reverse(slow.next);
        slow.next=null;

        boolean ans = isIdentical(head,head2);
    return ans;
    }
}