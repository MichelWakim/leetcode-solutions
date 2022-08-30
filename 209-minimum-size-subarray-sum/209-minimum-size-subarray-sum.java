class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLen = Integer.MAX_VALUE;
        int leftIdx = 0;
        int sum = 0;
        
        for (int i = 0 ; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i + 1 - leftIdx);
                sum -= nums[leftIdx ++];
            }
        }
        
        return (minLen != Integer.MAX_VALUE)? minLen : 0;
    }
}