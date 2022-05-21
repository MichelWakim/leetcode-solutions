class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        /**
        (y - y1) / (x - x1) = (y1 - y0) / (x1 - x0)
        
        In order to avoid being divided by 0, use multiplication form:
        (x1 - x0) * (y - y1) = (x - x1) * (y1 - y0) 
        => dx * (y - y1) = dy * (x - x1), 
        where dx = x1 - x0 and dy = y1 - y0
        */
        
        int x0 = coordinates[0][0], y0 = coordinates[0][1], 
            x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        
        for (int[] point : coordinates) {
            int x = point[0], y = point[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}