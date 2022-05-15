class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftIdx = 0,
            arrLength = nums.length,
            rightIdx = arrLength -1;
        
        if (target < nums[leftIdx]) return leftIdx;
        if (target > nums[rightIdx]) return arrLength;
        while(leftIdx <= rightIdx) {
            int middle = leftIdx + (rightIdx - leftIdx) / 2;
            if (nums[middle] < target) {
                leftIdx = middle + 1;
            } else if (nums[middle] > target) {
                rightIdx = middle - 1;
            } else {
                return middle;
            }
            
        }
        return leftIdx;
    }
}