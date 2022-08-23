class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int remainders[] = new int[60];
        int count = 0;
        for (int t: time) {
            count += remainders[(60 - t % 60) % 60];
            remainders[t % 60]++; // remember to update the remainders
        }
        return count;
    }
}