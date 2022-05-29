class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i = 0; i < nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
        
        /*
            other solutions 
            https://leetcode.com/problems/missing-number/discuss/69786/3-different-ideas%3A-XOR-SUM-Binary-Search.-Java-code
        */
    }
}