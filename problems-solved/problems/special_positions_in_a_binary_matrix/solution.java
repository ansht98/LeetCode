class Solution {
    public int numSpecial(int[][] mat) {
       int[] a = new int[mat.length];
        int[] b = new int[mat[0].length];
        int count  = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    a[i]++;
                    b[j]++;
                }
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    if (a[i] == 1 && b[j] == 1)
                        count++;
                }
            }
        }
        return count;
    }
}