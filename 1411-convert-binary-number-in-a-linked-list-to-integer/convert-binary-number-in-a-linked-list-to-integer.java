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
    public int getDecimalValue(ListNode head) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // int i=size-1;
        // temp=head;
        // int ans=0;
        // while(temp!=null){
        //     if(temp.val==1){
        //         ans+=Math.pow(2,i);
        //     }
        //     i--;
        //     temp=temp.next;

        // }
        // return ans;

        // if(head==null){
        //     return -1;
        // }
        // Stack<Integer>st=new Stack<>();
        // while(head!=null){
        //     st.push(head.val);
        //     head=head.next;
        // }
        // int ans=0;
        // int i=0;
        // while(!st.empty()){
        //     int num=st.pop();
        //     ans+=num*Math.pow(2,i);
        //     i++;
        // }
        // return ans;


        int res=0;
        while(head!=null){
            res=res*2+(int)head.val;
            head=head.next;
        }
        return res;


        
    }
}