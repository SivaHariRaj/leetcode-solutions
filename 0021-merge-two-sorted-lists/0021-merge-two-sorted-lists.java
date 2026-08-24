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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pointer1=list1;
        ListNode pointer2=list2;
        ListNode merge=null;
        ListNode merge1=null;
        int c=0;
        while(pointer1!=null && pointer2!=null)
        {
            if(pointer1.val<=pointer2.val)
            {
                if(merge==null)
                {
                    ListNode temp=pointer1.next;
                    merge=pointer1;
                    pointer1=temp;
                    c++;

                }
                else
                {
                ListNode temp=pointer1.next;
                pointer1.next=null;
                merge.next=pointer1;
                merge=pointer1;
                pointer1=temp; 
                c++;  
                }  
            }
            else
            {
                if(merge==null)
                {
                    ListNode temp=pointer2.next;
                    merge=pointer2;
                    pointer2=temp;
                   c++;
                }
                else
                {
                ListNode temp=pointer2.next;
                pointer2.next=null;
                merge.next=pointer2;
                merge=pointer2;
                pointer2=temp;
                c++;
                }
            }
            if(c==1)
            {
               merge1=merge;
            }
        }
        while(pointer1!=null)
        {
                if(merge==null)
                {
                    ListNode temp=pointer1.next;
                    merge=pointer1;
                    pointer1=temp;
                    c++;

                }
                else
                {
                ListNode temp=pointer1.next;
                pointer1.next=null;
                merge.next=pointer1;
                merge=pointer1;
                pointer1=temp; 
                c++;  
                }
                if(c==1)
            {
               merge1=merge;
            }
        }
        while(pointer2!=null)
        {
           if(merge==null)
                {
                    ListNode temp=pointer2.next;
                    merge=pointer2;
                    pointer2=temp;
                    c++;

                }
                else
                {
                ListNode temp=pointer2.next;
                pointer2.next=null;
                merge.next=pointer2;
                merge=pointer2;
                pointer2=temp; 
                c++;  
                }
                if(c==1)
            {
               merge1=merge;
            }

        }
        return merge1;
    }
}