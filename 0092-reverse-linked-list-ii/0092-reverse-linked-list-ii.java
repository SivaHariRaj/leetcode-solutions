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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode current=head;
        int c=1;
        ListNode pr=null;
        if(head==null || head.next==null)
        {
            return head;
        }
        while(current!=null )
        {
              if(c==left)
              {
                   
                   ListNode pre=null;
                   ListNode now=current;
                   ListNode lastnode=null;
                   ListNode firstnode=current;
                   while(c<=right)
                   {
                           if(c==right)
                           {
                            lastnode =now.next;
                           }
                           ListNode temp=now.next;
                           now.next=pre;
                           pre=now;
                           now=temp;
                           c++;
                   }
                   if(left==1)
                   { 
                            head=pre; 
                   }
                   else
                   {
                               pr.next=pre;
                   }
                   firstnode.next=lastnode;
                   break;

              }
              c++;
              pr=current;
              current=current.next;
        }
        return head;
    }
}