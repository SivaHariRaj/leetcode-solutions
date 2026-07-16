class Solution {
    public int majorityElement(int[] nums) {
        int current=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                current=nums[i];
            }
            if(nums[i]==current)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return current;
    }
}