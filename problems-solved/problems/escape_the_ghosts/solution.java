class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int x1 = target[0];
        int y1 = target[1];
        int myDistance = Math.abs(target[0]-0)+Math.abs(target[1]-0);
        for (int i = 0; i < ghosts.length; i++) {
            int x2 = ghosts[i][0];
            int y2 = ghosts[i][1];
            
            if (( Math.abs(x1-x2) + Math.abs(y1-y2))  <= myDistance) {
                return false;
            }
        }
        return true;
    }
}