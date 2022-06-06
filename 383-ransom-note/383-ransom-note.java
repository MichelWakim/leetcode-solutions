class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letters = new HashMap<>();
        
        for (char letter: magazine.toCharArray()) 
            letters.put(letter, letters.getOrDefault(letter, 0) +1);
        
        for (char letter: ransomNote.toCharArray()) {
            letters.put(letter, letters.getOrDefault(letter, 0) -1);
            if (letters.getOrDefault(letter, -1) < 0 ) return false;
        }
        
        return true;
    }
}