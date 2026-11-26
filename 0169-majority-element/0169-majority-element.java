class Solution {
    public int majorityElement(int[] nums)
    {
        int canditate=nums[0];
        int voter=1;
        for(int i=1;i<nums.length;i++)
        {
            if(canditate==nums[i])
            {
                  voter++;
            }
            else if(voter==0)
            {
                voter++;
                canditate=nums[i];
            }
            else 
            {
                voter--;
            }
        }
        return canditate;
    }
}