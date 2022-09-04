class Solution {
    public int uniqueLetterString(String s) {
        /*
            EXPLAINATION 
            https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/discuss/1195587/Java-Clean-O(n)-Solution-oror-detailed-explanation-of-why-it-works
        */
            
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);
        
        int[] secLastSeen = new int[26];
        Arrays.fill(secLastSeen, -1);
		
		int count = 0, res = 0;
	
		for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'A';
            count += i + secLastSeen[c] - (2 * lastSeen[c]);
            res += count;
            
            secLastSeen[c] = lastSeen[c];
            lastSeen[c] = i;
		}
        
		return res;
    }
}