class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int stepOne = 0;
        int stepTwo = 0;
        
        for (int i = 0; i < cost.length - 1; ++i) {
            int temp = stepOne;
            stepOne = Math.min(stepOne + cost[i + 1], stepTwo + cost[i]);
            stepTwo = temp;
        }
        
        return stepOne;
    }
}