class Solution {
    public boolean isHappy(int n) {
        while(n >= 10){
            int sum = 0;
            while(n > 0){
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            n = sum;
        }
        /*
            why 7 ?
            7^2 = 49 
            => 4^2 + 9^2 = 16 + 81 = 97 
            => 9^2 + 7^2 = 81 + 49 = 130 
            =>1^2 + 3^2 = 1 + 9 = 10 
            => 1^2 + 0^2 = 1
        */
        if(n == 1 || n == 7) return true;
        return false;
    }
}