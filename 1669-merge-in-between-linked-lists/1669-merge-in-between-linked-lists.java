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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp_a=null;
        ListNode temp_b=null;
        ListNode temp=list1;
        int n=0;
        while(n<=b)
        {
           if(n==a-1)
           {
              temp_a=temp; 
           }
           if(n==b)
           {
              temp_b=temp.next;
           }
           temp=temp.next;
           n++;
        }
        temp_a.next=list2;
        while(temp_a.next!=null)
        {
            temp_a=temp_a.next;
        }
        temp_a.next=temp_b;
        return list1;
    }
}