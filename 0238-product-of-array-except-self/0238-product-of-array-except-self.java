class Solution {
    public int[] productExceptSelf(int[] nums)
     {
        int []ans=new int[nums.length];
        int prefix=1;
        ans[0] = 1;
        for(int i=1;i<nums.length;i++)
        {
              ans[i]=prefix*nums[i-1];
              prefix=(prefix)*(nums[i-1]);
        }
        int postfix=1;
        for(int j=nums.length-2;j>=0;j--)
        {
            ans[j]=ans[j]*postfix*nums[j+1];
            postfix=postfix*nums[j+1];
        }
        return ans;
    }
}