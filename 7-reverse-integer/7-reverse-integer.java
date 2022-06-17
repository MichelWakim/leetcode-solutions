class Solution {
    public int reverse(int x) {
        int rev = 0;
        
        if (x == 0) {
            return rev;
        } 
        
        while (x != 0) {
            //check if it overflowes in the positive integers
            if ( rev >  Integer.MAX_VALUE /10 || (rev == Integer.MAX_VALUE/ 10 && (x % 10) > 7)) {
                return 0;
            } 
            //check if it overflowes in the negative integers
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && (x % 10) < -8)) {
                return 0;
            }
            
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }

        
        return rev;
    }
}