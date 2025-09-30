/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //We use hare and tortoise algorithm where we take two pointer slow one takes 1 step while fast takes 2 steps. 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //fast!=null covers null ll and breaks if it gets to null and fast.next means end node.
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}