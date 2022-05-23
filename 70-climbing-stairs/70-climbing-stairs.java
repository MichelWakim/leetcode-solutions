class Solution {
    public int climbStairs(int n) {
        //similar to fibonacci number
        if (n < 3) return n;
        
        int previous = 2,
            beforePrevious = 1;
        
        while( n -- > 2 ) {
            int current = previous + beforePrevious;
            beforePrevious = previous;
            previous = current;
        }
        
        return previous;
    }
}