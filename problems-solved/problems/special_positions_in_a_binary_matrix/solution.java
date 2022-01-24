class Solution {
    public int numSpecial(int[][] mat) {
        int sum = 0;
        int index = 0;
        int count = 0;
        for (int i =0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum = sum + mat[i][j];
                if (mat[i][j] == 1) {
                    index = j;
                }
            }
            if (sum == 1) {
                sum = 0;
                for (int k = 0; k < mat.length;k++) {
                    sum = sum + mat[k][index];
                    
                }
                if (sum == 1) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}