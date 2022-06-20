class Solution {
    public void reverseString(char[] s) {
        reverseStringHelper(s, 0);
    }
    
    public static void reverseStringHelper(char[] s, int idx) {
        int size = s.length;
        
        if(idx >= size/2) return;
        char temp = s[idx];
        s[idx] = s[size - idx - 1];
        s[size - idx - 1] = temp;
        
        reverseStringHelper(s, idx + 1);
    }
}