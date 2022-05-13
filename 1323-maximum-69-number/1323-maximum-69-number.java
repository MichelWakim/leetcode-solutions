class Solution {
    public int maximum69Number (int num) {
        for (int factor = 3; factor >= 0; factor --){
            int value = (int) (num / Math.pow(10, factor));
            if (value == 6 || value % 10 == 6) {
                return num + (int) (3 * Math.pow(10, factor));
            }
        }
        return num;
    }
}