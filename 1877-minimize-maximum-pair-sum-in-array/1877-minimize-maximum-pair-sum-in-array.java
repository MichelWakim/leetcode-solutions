class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0, arrayLength = nums.length;
        
        for(int i = 0; i <= arrayLength / 2; i++) {
            sum = Math.max(sum, nums[i] + nums [arrayLength - i -1]);
        }
        
        return sum;
    }
}