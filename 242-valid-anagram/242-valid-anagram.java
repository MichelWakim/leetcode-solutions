class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] charsMap = new int['z'-'a'+1];

        
        for(char c: s.toCharArray()) {
            int pos = c - 'a';
            charsMap[pos]++;
        }

        for(char c: t.toCharArray()) {
            int pos = c - 'a';
            charsMap[pos]--;
        }

        for(int count: charsMap) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }
}