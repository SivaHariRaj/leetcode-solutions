class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack=new ArrayDeque<>();
        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        for(int i=0;i<nums.length*2;i++)
        {
            int i1=i%nums.length;
            while(!stack.isEmpty() && nums[i1]>nums[stack.peek()])
            {
                result[stack.pop()]=nums[i1];
            }
            if(i<nums.length)
            {
            stack.push(i);
            }
        }
        return result;
    }
}