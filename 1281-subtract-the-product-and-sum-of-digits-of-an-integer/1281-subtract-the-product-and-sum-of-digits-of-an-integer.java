class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0,
            prod = 1,
            firstNonZero = 5;
        
        for(int factor = 5; factor >= 0 ; factor --) {
            int num = (int) (n / Math.pow(10, factor));
            firstNonZero = num > 0
                ? firstNonZero
                : Math.min(firstNonZero, factor);
            num %= 10;
            sum += num;
            prod *= (num == 0 &&  factor >= firstNonZero? 1 : num);
        }
        return prod - sum;
    }
}