class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length;i++) {
            sum = sum + mat[i][i];
            sum = sum + mat[(mat.length-1)-i][i];
        }
        
          
        if (mat.length%2 == 1) {
            sum = sum - mat[(mat.length-1)/2][(mat.length-1)/2];
        }
       return sum;
    }
}