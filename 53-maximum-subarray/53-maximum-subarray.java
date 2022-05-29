class Solution {
    public int maxSubArray(int[] nums) {
        /*
            explaination :
            https://leetcode.com/problems/maximum-subarray/discuss/1595097/JAVA-or-Kadane's-Algorithm-or-Explanation-Using-Image
        */
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += nums[i];
            max = Math.max(sum, max);
            
            if(sum < 0) sum = 0;
        }
        
        return max;
    }
}