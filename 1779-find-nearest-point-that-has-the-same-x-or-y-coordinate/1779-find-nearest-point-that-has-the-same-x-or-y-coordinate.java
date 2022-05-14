class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        double min = Double.MAX_VALUE;
        int index = -1;
        
        for(int i = 0; i< points.length; i++) {
            int diffX = points[i][0] - x,
                diffY = points[i][1] - y;
            double distance = diffX == 0 || diffY == 0
                ? Math.sqrt(
                    Math.pow(diffX, 2) 
                    + Math.pow(diffY, 2) 
                ): min;
            
            if(distance < min){
                min = distance;
                index = i;
            }
        }
        return index;
    }
}