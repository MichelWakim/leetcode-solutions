class Solution {
    public boolean areAlmostEqual(String s1, String s2) {        
        int count = 0;
        Character char1 = null,
            char2 = null;
        
        for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if(c1 != c2) {
                //count == 2 because we need to swipe 2 different chars
                if(count == 2 ) return false;
                else{
                    if(char1 == null) {
                        char1 = c1;
                        char2 = c2; 
                    } else {
                        if(char1 != c2 || char2 != c1) return false;
                    }
                    count ++;  
                } 
            }
        }
        return count == 2 || count == 0;
    }
}