class Solution {
    public int singleNumber(int[] nums) {
        /** 
            Explaination :
            https://www.youtube.com/watch?v=XzQSPg6LFyY
        */
        // int result = 0;
        // for(int num : nums) result ^= num;
        // return result;
        
        
        Set<Integer> hashset = new HashSet<>();
        for (int num : nums) {
            if (hashset.contains(num)) {
                hashset.remove(num);
            } else{
            hashset.add(num);
                }
        }
        return hashset.stream().findFirst().get();
        
    }
}