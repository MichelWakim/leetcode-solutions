class Solution {
    public int balancedStringSplit(String s) {
        int result = 0, sum = 0;
        
        // for (char letter : s.toCharArray()) {
        //     sum += (letter == 'R'? 1 : -1);
        //     result += (sum == 0? 1: 0);
        // }
        
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) == 'R'? 1 : -1);
            result += (sum == 0? 1: 0);
        }
        
        return result;
    }
}