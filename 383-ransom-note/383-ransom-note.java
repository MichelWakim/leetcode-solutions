class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
//         Map<Character, Integer> letters = new HashMap<>();
        
//         for (char letter: magazine.toCharArray()) 
//             letters.put(letter, letters.getOrDefault(letter, 0) +1);
        
//         for (char letter: ransomNote.toCharArray()) {
//             letters.put(letter, letters.getOrDefault(letter, 0) -1);
//             if (letters.getOrDefault(letter, -1) < 0 ) return false;
//         }
        
//         return true;
        
        /*
            the array is faster and almost same space
        */
        int[] alphabetsCounter = new int[26];
        
        for (char letter : magazine.toCharArray())
            alphabetsCounter[letter-'a']++;

        for (char letter : ransomNote.toCharArray()){
            if (alphabetsCounter[letter-'a'] == 0) return false;
            alphabetsCounter[letter-'a']--;
        }
        return true;
    }
}