class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0,
            ones = 0,
            idx = 0;
        
        for(int num : nums){
            if(num == 0) zeroes++;
            if(num == 1) ones++;
        }
        
        while(zeroes -- > 0 && idx< nums.length) nums[idx++] = 0;
        while(ones -- > 0 && idx < nums.length) nums[idx++] = 1;
        while(idx < nums.length) nums[idx++] = 2;
        
    }
}