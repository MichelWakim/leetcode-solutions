class Solution {
    public double myPow(double x, int n) {
        
        /*
            Explaination:
            https://leetcode.com/problems/powx-n/discuss/1625042/JAVA-C%2B%2B-%3A-Simple-or-Olog(n)-or-Easy-or-Faster-than-100-or-Explained
        */
        if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    }
}