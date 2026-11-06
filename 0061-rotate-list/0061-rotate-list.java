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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;

        ListNode tail = head;
        int length=1;
        while(tail.next!=null)
        {
            length++;
            tail=tail.next;
        }

        if(k % length==0) return head;
        k = k%length;
        tail.next = head;

        int count=1;
        int mid = length - k;

        ListNode temp = head;
        while(count!=mid)
        {
            temp = temp.next;
            count++;
        }
        
        head = temp.next;
        temp.next=null;

    return head;
    }
}