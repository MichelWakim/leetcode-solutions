class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26];
        for (int i = 0; i < sentence.length(); ++i) 
            alphabet[sentence.charAt(i) - 'a']++;
        for (int letter: alphabet) { if (letter == 0) return false; }
        return true;
    }
}