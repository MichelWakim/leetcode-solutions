class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && Integer.bitCount(n) == 1;
        
        //https://leetcode.com/problems/power-of-two/discuss/676942/JAVA-or-(-n-and-(-n-1-)-)-Explained-or-2-Line-Solution
        
        // return n>0 && (n & (n-1)) == 0;
    }
}