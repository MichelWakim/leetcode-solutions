class Solution {
    public long numberOfWays(String s) {
        // Explaination 
        // https://leetcode.com/problems/number-of-ways-to-select-buildings/discuss/1907179/JavaPython-3-One-pass-T-O(n)-S-O(1)-codes-and-follow-up-w-brief-explanation-and-analysis.
        long one = 0, zero = 0, oneZero = 0, zeroOne = 0, ways = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '0') {
                ++zero;
                oneZero += one; // Count in '10'.
                ways += zeroOne; // Count in '010'.
            }else {
                ++one;
                zeroOne += zero; // Count in '01'.
                ways += oneZero; // Count in '101'.
            }
        }
        return ways;
    }
}