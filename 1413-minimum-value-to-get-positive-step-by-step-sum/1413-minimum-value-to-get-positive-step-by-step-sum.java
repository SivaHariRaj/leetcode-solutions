class Solution {
    public int minStartValue(int[] nums) {
        
        int sum = 0;
        int lowest = 0;

        for (int num : nums) {

            sum += num;

            if (sum < lowest) {
                lowest = sum;
            }
        }

        int startValue = 1;

        while (startValue + lowest < 1) {
            startValue++;
        }

        return startValue;
    }
}