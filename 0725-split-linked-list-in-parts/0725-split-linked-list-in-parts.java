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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur = head;
        int length =0;
        while(cur !=null){
            length++;
            cur = cur.next;
        }
        int bucketNodes = length/k;
        int remainingNodes = length %k;

        cur = head;
        ListNode prev = null;
        ListNode [] ans = new ListNode[k];

        for(int i=0; i<k;i++){
            ans[i] = cur;
            for(int cnt=1; cnt<=bucketNodes + (remainingNodes >0 ?1:0); cnt++){
                if(cur !=null){
                    prev = cur;
                cur = cur.next; 
                } 
            }
            if(cur !=null){
               prev.next = null;
            remainingNodes--; 
            }
            
        }
return ans;
    }
}