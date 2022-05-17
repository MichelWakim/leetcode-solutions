class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftIdx = 0,
            rightIdx = numbers.length - 1;
        
        while (numbers[rightIdx] + numbers[leftIdx] != target) {
            if (numbers[rightIdx] + numbers[leftIdx] > target) rightIdx --;
            else leftIdx ++;
        }
        
        return new int[] {++leftIdx, ++rightIdx };
    }
}