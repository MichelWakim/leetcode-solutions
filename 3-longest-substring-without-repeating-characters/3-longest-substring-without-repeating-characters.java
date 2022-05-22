class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, length = 0;
        Set<Character> seen = new HashSet();
        char currentChar;
        for(int right = 0; right < s.length(); right++) {
            currentChar = s.charAt(right);
			
			// shrink the window as long as you have a repeated character
            while(seen.contains(currentChar)) seen.remove(s.charAt(left++));
			
            seen.add(currentChar);
            length = Math.max(length, right - left + 1);
        }
        
        return length;
    }
}