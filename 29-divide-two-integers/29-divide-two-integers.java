class Solution {
    public int divide(int dividend, int divisor) {
        long division = (long) dividend / (long) divisor;
        
        return  division >= Integer.MAX_VALUE 
            ? Integer.MAX_VALUE  
            : division <= Integer.MIN_VALUE 
                ? Integer.MIN_VALUE  
                : (int) division;
    }
}