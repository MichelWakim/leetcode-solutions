class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] charsMap = new int['z'-'a'+1];

        for(int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            charsMap[idx] ++;
            idx = t.charAt(i) - 'a';
            charsMap[idx] --;
        }

        for(int count: charsMap) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }
}