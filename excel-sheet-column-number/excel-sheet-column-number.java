class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        
        for(char letter: columnTitle.toCharArray()) {
            sum *= 26;
            sum += letter - 'A' + 1;
        }
        
        return sum;
    }
}