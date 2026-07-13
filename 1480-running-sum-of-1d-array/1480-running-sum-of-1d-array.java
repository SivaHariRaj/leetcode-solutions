class Solution {
    public int[] runningSum(int[] nums) {
    int count=0;
    int []rn=new int[nums.length];
    for(int i=0;i<nums.length;i++)
    {
          count+=nums[i];
          rn[i]=count;
    }
    return rn;
    }
}