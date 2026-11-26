class Solution {
    public int[] productExceptSelf(int[] nums)
    {
        int p=1;
        int s=1;
        int []suffix=new int[nums.length];
        int []prefix=new int[nums.length];
        int []answer=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
               prefix[i]=p;
               p*=nums[i];

        }
        for(int j=nums.length-1;j>=0;j--)
        {
               suffix[j]=s;
               s*=nums[j];
        }
        for(int i=0;i<nums.length;i++)
        {
           answer[i]=prefix[i]*suffix[i];
        }
        return answer;
    }
}