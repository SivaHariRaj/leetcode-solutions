class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int answer=-1;
        while(left<right)
        {
            answer=Math.max(answer,(right-left)*Math.min(height[left],height[right]));
            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return answer;
    }
}