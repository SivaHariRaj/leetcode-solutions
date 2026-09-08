class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first=-1;
       int last=-1;
       int left=0;
       int right=nums.length-1;
       while(left<=right)
       {
             int mid=(left+right)/2;
             if(nums[mid]==target)
             {
                 first=mid;
                 right=mid-1;
             }
             else if(nums[mid]<target)
             {
                left=mid+1;
             }
             else
             {
                right=mid-1;
             }
       }
       int left1=0;
       int right1=nums.length-1;
       while(left1<=right1)
       {
             int mid=(left1+right1)/2;
             if(nums[mid]==target)
             {
                last=mid;
                 left1=mid+1;
             }
             else if(nums[mid]<target)
             {
                left1=mid+1;
             }
             else
             {
                right1=mid-1;
             }
       }
       return new int[]{first, last};
    }
}