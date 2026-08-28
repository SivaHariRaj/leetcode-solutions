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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node=null;
        ListNode ite=null;
        int carry=0;
        int sum=0;
        while(l1!=null || l2!=null)
        {
            if(l1==null)
            {
                int num1=l2.val;
                int s=num1+carry;
                if(s>9)
                {
                   carry=s/10;
                   sum=s%10;
                }
                else
                {
                   carry=0;
                   sum=s;
                }
                l2=l2.next; 
                   
            }
            else if(l2==null)
            {
                int num1=l1.val;
                int s=num1+carry;
                if(s>9)
                {
                   carry=s/10;
                   sum=s%10;
                }
                else
                {
                    sum=s;
                    carry=0;
                }
                l1=l1.next;  
            }
            else
            {
                int num1=l1.val;
                int num2=l2.val;
                int s=num1+num2+carry;
                if(s>9)
                {
                   carry=s/10;
                   sum=s%10;
                }
                else
                {
                    sum=s;
                    carry=0;
                }
                l1=l1.next;
                l2=l2.next;
            }
            if(node==null)
            {
                ListNode newNode = new ListNode(sum);
                newNode.next=null;
                node=newNode;
                ite=newNode;
            }
            else
            {
                    ListNode newNode =new ListNode(sum);
                    newNode.next=null;
                    node.next=newNode;
                    node=newNode;
            }

        }
        if(carry != 0)
       {
               node.next = new ListNode(carry);
        }
        return ite;
    }
}