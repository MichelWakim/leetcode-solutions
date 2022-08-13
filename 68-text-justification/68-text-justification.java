class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justification  = new ArrayList<>();

        for(int i=0; i<words.length; i++) {
            StringBuilder line = new StringBuilder();
            int len = 0;
            int wordsLen = 0;
            int leftIdx = i;
            int rightIdx = i;
            
            while(rightIdx < words.length && len + words[rightIdx].length() <= maxWidth) {
                len += words[rightIdx].length()+1;
                wordsLen += words[rightIdx].length();
                rightIdx++;
            }
            int gaps = rightIdx - leftIdx - 1;
            int padding = rightIdx == words.length ? gaps : maxWidth-wordsLen;

            int spacing = gaps == 0 ? 1 : padding / gaps;
            int extraSpace = gaps != 0 ? padding % gaps : 0;
            while (leftIdx < rightIdx) {
                line.append(words[leftIdx]);
                if (leftIdx++ != rightIdx - 1) line.append(" ".repeat(spacing));
                if (extraSpace-- > 0) line.append(" ");
            }
            while(line.length() < maxWidth) line.append(" ");
            i = rightIdx-1;
            justification.add(line.toString());
        }
        return justification;
    }
}