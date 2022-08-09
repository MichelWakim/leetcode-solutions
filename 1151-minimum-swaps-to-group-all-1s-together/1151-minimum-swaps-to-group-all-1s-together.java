class Solution {
    public int minSwaps(int[] data) {
        int ones = Arrays.stream(data).sum();
        int currentOnes = 0, maxOnes = 0;
        int left = 0, right = 0;

        while (right < data.length) {
            currentOnes += data[right++];
            if (right - left > ones) currentOnes -= data[left++];
            maxOnes = Math.max(maxOnes, currentOnes);
        }
        return ones - maxOnes;
    }
}