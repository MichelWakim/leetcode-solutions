class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE,
            max = Integer.MIN_VALUE;
        double sum = 0;
        
        for (int sal: salary){
            min = Math.min(sal, min);
            max = Math.max(sal, max);
            sum += sal;
        }
        
        return (sum - min - max) / (salary.length - 2);
    
        
    }
}