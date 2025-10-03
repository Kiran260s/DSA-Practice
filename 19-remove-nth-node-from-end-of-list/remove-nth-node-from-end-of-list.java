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
       //Create Dummy node to simplfy the deletion of head as in example 2
       ListNode dummy = new ListNode(0, head);
       ListNode first = dummy;
       ListNode second = dummy;
       //Move first n+1 steps because if we take n then second will be on nth node
    //    Case 2: Move first n+1 steps ahead
    //             Now the gap between first and second is n+1 nodes.
    //             So, when first reaches the end, second will be just before the node to delete.
    // That gives us exactly what we want: second.next is the node to remove.
       for(int i=0; i<=n; i++){
        first = first.next;
       }
       //Move both pointers until first reaches null
       while(first != null){
        first = first.next;
        second = second.next;
       }
       //Remove the nth node
       second.next = second.next.next;

//        Input: head = [1], n = 1
// Expected Output: [] (empty list)

// Steps:

// Create dummy: 0 -> 1
// first = dummy, second = dummy.

// Move first n+1 = 2 steps ahead:

// i=0: first = 1

// i=1: first = null

// Now first = null, second = dummy (0).

// Since first is already null, we skip the while loop.

// second.next = second.next.next → dummy.next = null.

// Return dummy.next, which is null. ✅

// Final list = []

       return dummy.next;
    }
}