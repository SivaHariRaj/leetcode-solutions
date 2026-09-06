class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        int count=1;
        for(int x:set)
        {
              if(!set.contains(x-1)){
              int current=1;
              int num=x;
             while(set.contains(num+1))
             {
                 num=num+1;
                 current++;
             }
             count=Math.max(current,count);}
        }
        return count;
    }
}