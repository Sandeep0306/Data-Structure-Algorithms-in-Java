/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode node1 = headA;
       ListNode node2 = headB;

       while(node1 != node2){ // Two Pointer approach
           node1 = node1 ==null ? headB : node1.next;
           node2 = node2 ==null ? headA : node2.next;
       }

       return node1;
    }
}

 // Using Set Approach if node1 set contains node2 we will simply return that Node Time Complexity : O(N +M) , Space: O(1)

//  public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Set<ListNode> ans = new HashSet<>();

//        while(headA !=null){
//            ans.add(headA);
//            headA = headA.next;
//        }

//        while(headB !=null){
//            if(ans.contains(headB)){
//                return headB;
//            }
//            headB = headB.next;
//        }
//         return null;
//     }
// }