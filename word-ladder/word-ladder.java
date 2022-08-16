class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        
        Set<String> words = new HashSet<>(wordList);
        words.remove(beginWord);
        
        int level = 0;
        
        while ( !queue.isEmpty()) {
            int size = queue.size();
            level++;
            
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(endWord)) return level;
                
                List<String> neighbors = neighbors(currentWord);
                for (String neighbor : neighbors) {
                    if (words.contains(neighbor)) {
                        words.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        
        return 0;
    }
    
    protected List<String> neighbors(String word) {
        char[] wordChars = word.toCharArray();
        List<String> allNeighbors = new ArrayList<>();
        
        for (int i = 0; i < wordChars.length; i++) {
            char initialLetter = wordChars[i];
            
            for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
                wordChars[i] = alphabet ;
                allNeighbors.add(new String(wordChars));
            }
            wordChars[i] = initialLetter;
        } 
        
        return allNeighbors;
    }
}