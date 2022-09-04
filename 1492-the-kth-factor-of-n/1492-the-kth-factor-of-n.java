class Solution {
    public int kthFactor(int n, int k) {
        int factor = 1;
        
        while (k > 0 && factor <= n) {
            if (n % factor == 0) k--;
            factor ++;
        }
        return k > 0? -1: factor - 1;
    }
}