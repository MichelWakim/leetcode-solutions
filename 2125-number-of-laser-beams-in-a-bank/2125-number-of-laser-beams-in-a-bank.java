class Solution {
    public int numberOfBeams(String[] bank) {
        int numberOfZeroes = 0,
            numberOfBeams = 1;
        long prev = 0;
        
        for(String b: bank) {
            long beams = b.chars().filter(ch -> ch == '1').count();
            if(beams == 0) {
                numberOfZeroes++;
            } else {
                numberOfBeams += (beams * prev);
                prev = beams;
            }
        }
        
        return numberOfZeroes >= bank.length -1? 0: (int) numberOfBeams - 1;
    }
}