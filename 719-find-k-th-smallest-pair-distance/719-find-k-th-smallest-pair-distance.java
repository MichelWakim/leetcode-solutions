class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        
        int smallest = 0;
        int highest = nums[nums.length - 1] - nums[0];
        
        while (smallest < highest) {
            int mid = (smallest + highest) / 2;
            int count = 0,
                left = 0;
            
            for (int right = 0 ; right < nums.length; ++right) {
                while (nums[right] - nums[left] > mid) left++;
                count += right - left;
            }
            //count = number of pairs with distance <= mi
            if (count >= k) highest = mid;
            else smallest = mid + 1;
        }
        
        return smallest;
    }
}