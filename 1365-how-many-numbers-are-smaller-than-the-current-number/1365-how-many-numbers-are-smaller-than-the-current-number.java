class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []freq=new int[101];
        for(int x:nums)
        {
            freq[x]++;
        }
        for(int i=1;i<101;i++)
        {
            freq[i]=freq[i]+freq[i-1];
        }
        int []ans=new int[nums.length];
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                ans[j]=0;
            }
            else
            {
                ans[j]=freq[nums[j]-1];
            }
        }
        return ans;
    }
}