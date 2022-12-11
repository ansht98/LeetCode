class Solution {
    public int maximumWealth(int[][] accounts) {
        int l = accounts[0].length;
        int l2 = accounts.length;
        int max = 0;
        for (int i = 0; i<l2; i++){
            int sum = 0;
            for (int j = 0; j < l; j++){
                sum = sum + accounts[i][j];
                }
                if (sum>max){
                    max = sum;
                }
        }
        return max;
    }
}