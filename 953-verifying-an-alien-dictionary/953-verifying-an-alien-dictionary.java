class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0 ; i<words.length-1 ; i++){
            
            boolean same = true;
            
            String a = words[i],
                b = words[i+1];
            
            for(int j = 0 ; j < Math.min(a.length(),b.length()) ; j++){
                if(a.charAt(j) != b.charAt(j)){
                    same = false;
                    int index_a = order.indexOf(a.charAt(j));
                    int index_b = order.indexOf(b.charAt(j));
                    if(index_b < index_a){
                        return false;
                    }
                    break;
                } 
            }
            if(same && a.length() > b.length()){
               return false;
            }
        }
        return true;
    }
}