class Solution {
    public String reorganizeString(String s) {
        // TC : O(n), SC : O(n)
        
        int max = 0;
        char maxCh = 'a';

        // calculate the count of characters
        int[] hash = new int[26];
        for(char ch : s.toCharArray()) {
            hash[ch-'a']++;
            
            // find the max
            if(hash[ch-'a'] > max) {
                max = hash[ch-'a'];
                maxCh = ch;
            }
        }
        
        int n = s.length();

        // check if it is possible to reorganise the string as required
        if((n+1)/2 < max) return "";
        
        char[] result = new char[n];
        int idx = 0;

        // fill the most frequent char
        while(max > 0) {
            result[idx] = maxCh;
            max--;
            idx+=2;
        }
        hash[maxCh-'a'] = 0;
        
        // fill the remaining chars
        for(int i=0;i<26;i++) {
            while(hash[i] > 0) {
                if(idx >= n) idx = 1;
                result[idx] = (char)(i+'a');
                hash[i]--;
                idx+=2;
            }
        }
        
        return new String(result);
    }
}