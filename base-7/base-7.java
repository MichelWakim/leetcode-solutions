class Solution {
    public String convertToBase7(int num) {
        int sign = 1;
        int digit = 1;
        int answer = 0;

        if(num < 0) {
            sign = -1;
            num *= -1;
        }
         
        while (num > 0) {
            answer += (num % 7) * digit;
            digit *= 10;
            num /= 7;
        }
        
        answer *= sign; 
        return  Integer.toString(answer);
    }
}