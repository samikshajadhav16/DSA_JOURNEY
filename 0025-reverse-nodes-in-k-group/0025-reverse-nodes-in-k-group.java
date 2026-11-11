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
    public ListNode findKthNode(ListNode curr , int k)
    {
        while(curr!=null && k>1)
        {
            curr = curr.next;
            k--;
        }
    return curr;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<=1) return head;

        ListNode temp = head;
        temp = head;
        ListNode prevlast = null;
        while(temp!=null)
        {
            ListNode kthnode = findKthNode(temp,k);
            if(kthnode == null)
            {
                if(prevlast!=null)
                {
                    prevlast.next = temp;
                }
                break;
            }
            ListNode newnext = kthnode.next;
            kthnode.next = null;
            reverse(temp);
            if(temp==head)
            {
                head = kthnode;
            }else{
                prevlast.next = kthnode;
            }
            prevlast = temp;
            temp = newnext;
        }
    return head;
    }
}