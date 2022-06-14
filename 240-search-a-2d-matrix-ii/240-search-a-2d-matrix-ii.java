class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row: matrix){
            int smallCol = 0,
                    bigCol = row.length - 1;
            
            while(smallCol <= bigCol) {
                int midCol = (smallCol + bigCol) / 2;
                    
                if (row[midCol] > target) bigCol = midCol - 1;
                else if (row[midCol] < target) smallCol = midCol + 1;                                 else return true;
            }  
         }
        return false;
    }
}