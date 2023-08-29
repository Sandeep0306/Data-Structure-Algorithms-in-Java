/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteMiddle = function(head) {

    if(head.next ==null) {
        return null;
    }

     let res = head;
     let ans = head;
     let count =0;
     while(res != null){
         count++;
         res= res.next;
     }
     console.log(count);
     let mid = Math.floor(count/2);

     for(let i=0; i<mid-1;i++){
        ans = ans.next; 
     }
     ans.next = ans.next.next;
     return head;

};