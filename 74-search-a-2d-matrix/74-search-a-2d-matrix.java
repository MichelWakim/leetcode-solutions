class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int smallRow = 0,
            bigRow = matrix.length - 1,
            smallCol = 0,
            bigCol = matrix[0].length - 1;
        
        //check the edges
        if (target < matrix[0][0] || target > matrix[bigRow][bigCol]) return false;
        
        while( smallRow <= bigRow ) {
            int midRow = (smallRow + bigRow) / 2;
            
            if (matrix[midRow][0] > target) bigRow = midRow - 1;
            else if (matrix[midRow][bigCol] < target) smallRow = midRow + 1;
            else {
                while(smallCol <= bigCol) {
                    int midCol = (smallCol + bigCol) / 2;
                    
                    if (matrix[midRow][midCol] > target) bigCol = midCol - 1;
                    else if (matrix[midRow][midCol] < target) smallCol = midCol + 1;
                    else return true;
                }
                return false;
            }
        }
        return false;
    }
}