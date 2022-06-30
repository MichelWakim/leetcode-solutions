class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int leftIdx = 0,
            rightIdx = nums.length-1;
        
        int count = 0;
        
        while(leftIdx < rightIdx) 
            count += nums[rightIdx--] - nums[leftIdx++];
        
        return count;
    }
}