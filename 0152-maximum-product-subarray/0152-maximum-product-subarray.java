class Solution {
    public int maxProduct(int[] nums) {
        
        int currentMax = nums[0];
        int currentMin = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int num = nums[i];

            int tempMax = Math.max(
                num,
                Math.max(num * currentMax, num * currentMin)
            );

            int tempMin = Math.min(
                num,
                Math.min(num * currentMax, num * currentMin)
            );

            currentMax = tempMax;
            currentMin = tempMin;

            answer = Math.max(answer, currentMax);
        }

        return answer;
    }
}