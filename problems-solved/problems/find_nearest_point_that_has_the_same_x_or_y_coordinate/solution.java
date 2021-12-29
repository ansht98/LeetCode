class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = 0;
        int index = -1;
        int dist = 0;
        
        for (int i = 0; i < points.length; i++) {
            if (x - points[i][0] == 0 || y - points[i][1] == 0) {
                min = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                index = i;
                break;
            }
        }
        
        for (int j = 0; j < points.length; j++) {
            if (x - points[j][0] == 0 || y - points[j][1] == 0) {
                dist = Math.abs(x - points[j][0]) + Math.abs(y - points[j][1]);
                if (dist < min) {
                min = dist;
                index = j;
                }
            }
        }
        return index;
    }
}