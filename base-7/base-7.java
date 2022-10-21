class Solution {
    public String convertToBase7(int num) {
        int sign = 1;
        int digit = 0;
        int answer = 0;

        
        if(num < 0) {
            sign = -1;
            num *= -1;
        }
        
        
        while (num > 0) {
            int n = (num % 7) * (int) Math.pow(10, digit++);
            answer += n;
            num /= 7;
        }
        
        answer *= sign; 
        return  Integer.toString(answer);
    }
}