class Solution {
    public String reverseWords(String s) {
        int leftIdx = 0, rightIdx = 0;
        
        char[] c = s.toCharArray();
        
        for (; leftIdx <= c.length && rightIdx <= c.length; rightIdx ++){
            if (rightIdx == c.length 
                || c[rightIdx] == ' ') {
                reverseWord(c, leftIdx, rightIdx);
                leftIdx = rightIdx + 1;
            }
        }
        return new String(c);
    }
    
    private void reverseWord(char[] c, int i, int j) {
        --j;
        while (i < j) {
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
    }
}