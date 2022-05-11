class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length]; 
        int i = 0;
        
        for(int[] query: queries){
            int x = query[0],
                y = query[1],
                r = query[2],
                count = 0;
            
            for(int[] point: points){
                if(r * r >= (x-point[0])*(x-point[0])+ (y-point[1])*(y-point[1])) {
                    count ++;
                }   
            }
            answer[i++] = count;
            
        }
        
        return answer;
        
    }
}