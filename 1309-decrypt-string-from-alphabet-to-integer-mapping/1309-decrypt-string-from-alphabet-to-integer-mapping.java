class Solution {
    public String freqAlphabets(String s) {
        //used stringbuiled append b/c it's optimized
        StringBuilder output = new StringBuilder(); 
        
         //starts from last character, goes till first character
        for(int i = s.length()-1; i >= 0; i--){ 
            int value = 0;
            
            //using ascii, add 'a' to start from the alphabet, subtract '0' b/c currently the digits in the String s are chars
            if(s.charAt(i) == '#'){
                value = (s.charAt(i-1) -'0' ) + 10*(s.charAt(i-2)-'0') -1 ; 
                
                
                //have skip 2 characters , b/c we already checked it in the above line
                i -= 2; 
            } else {
                value =  s.charAt(i) - '0' -1;
            }
            output.append((char)('a' + value));
        }
        //very helpful method, reverses the whole string
        output.reverse(); 
        //convert StringBuilder obj to string
        return output.toString(); 
    }
}