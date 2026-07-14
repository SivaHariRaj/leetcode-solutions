class Solution {
    public int pivotIndex(int[] nums) {
        int []prefix=new int[nums.length];
        int []postfix=new int[nums.length];
        postfix[nums.length-1]=0;
        prefix[0]=0;
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i - 1] + nums[i - 1];
        }
        for(int i1=nums.length-2;i1>=0;i1--)
        {
            postfix[i1]=nums[i1+1]+postfix[i1+1];
        }
        for(int j=0;j<nums.length;j++)
        {
            if(postfix[j]-prefix[j]==0)
            {
                return j;
            }
        }
        return -1;
    }
}