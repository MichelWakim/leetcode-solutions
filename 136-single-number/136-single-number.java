class Solution {
    public int singleNumber(int[] nums) {
        /** 
            Explaination :
            https://www.youtube.com/watch?v=XzQSPg6LFyY
        */
        int result = 0;
        for(int num : nums) result ^= num;
        return result;
        
        
    }
}