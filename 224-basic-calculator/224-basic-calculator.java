class Solution {
    public int calculate(String s) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int operand = 0, sign = 1, result = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) 
                operand = 10 * operand + (int) (c- '0');
            else if (c == '+' || c == '-') {
                result += sign * operand;
                sign = (c == '+'? 1 : -1);
                operand = 0;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign * operand;
                result *= stack.pop();
                result += stack.pop();
                operand = 0;
            }
        }
        return result + sign * operand;
    }
}