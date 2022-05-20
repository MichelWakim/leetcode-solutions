class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        /**
            Explaination :
            https://leetcode.com/problems/sum-of-all-odd-length-subarrays/discuss/854184/JavaC%2B%2BPython-O(N)-Time-O(1)-Space
            https://www.youtube.com/watch?v=J5IIH35EBVE&feature=emb_logo
        */

        int res = 0, 
            n = arr.length;
        
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return res;
    }
}