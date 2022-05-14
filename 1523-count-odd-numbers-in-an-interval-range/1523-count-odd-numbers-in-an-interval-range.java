class Solution {
    public int countOdds(int low, int high) {
        return (int) (high - low) / 2 
            + (low % 2 == 0 
               && high % 2 == 0?
               0 : 1) ;
    }
}