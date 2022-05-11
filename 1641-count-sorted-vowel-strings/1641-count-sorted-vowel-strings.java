class Solution {
    public int countVowelStrings(int n) {
        /*
            Explaination:
            r = 5 number of vowels
            xCy = x!/(y! * (x-y)!) "combination function"
            where 
            x = f(n) = n + a
            y = g(r) = r + b
            by setting n = 1 and r = 5
            x!/(y! * (x-y)!) = 5 
            by n = 2 and r = 5 
            x!/(y! * (x-y)!) = 15 
            
            x = (n + 4)
            y = (r - 1) = 4
            xCy = (n + 4)! / (4! * (n + 4 - 4)!) 
                = ((n + 4) * (n + 3) * (n + 2) * (n + 1) * n!) /(4! * n!)
            
            removing n! from num and denum
        */
        return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }
}