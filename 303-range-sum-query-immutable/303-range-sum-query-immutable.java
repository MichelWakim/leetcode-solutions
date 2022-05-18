class NumArray {
    
    private int[] sum;
    
    public NumArray(int[] nums) {
        sum = nums;
        for (int i = 1; i < nums.length; i++) {
            sum[i] += sum[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
         return left == 0 ? sum[right] : sum[right] - sum[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */