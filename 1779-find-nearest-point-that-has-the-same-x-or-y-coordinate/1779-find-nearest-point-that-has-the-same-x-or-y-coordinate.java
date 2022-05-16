class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE, ans = -1, idx = -1;
	    for (int[] point : points) {
            idx++;
            if (point[0] == x || point[1] == y) {
                int dist = Math.abs(x - point[0]) + Math.abs(y - point[1]);
                if (dist < min) {
                    min = dist;
                    ans = idx;
                }
            }
        }

	    return ans;
    }
}