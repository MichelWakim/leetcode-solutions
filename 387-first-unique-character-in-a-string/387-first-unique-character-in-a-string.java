class Solution {
    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        
        for (char i = 'a'; i <= 'z';i++) {
            int ind = s.indexOf (i);
            
            if (ind != -1 && ind == s.lastIndexOf (i))
                ans = Math.min (ans,ind);
        }
        
        return ans == Integer.MAX_VALUE? -1 : ans;
    }
}