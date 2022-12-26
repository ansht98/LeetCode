class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        if (n>3){
        int sum = 0;
        int j = 1;
        int k = 0;
        int[] ans = new int[n];
        int s = (2*n)/3;
        /*for (int i = n/3;i<(2*n)/3;i++) {
            int temp = piles[i];
            piles[i] = piles[s];
            piles[s] = temp;
            s++;
        }*/
        /*for (int i = 0;i<n;i++) {
            System.out.print(piles[i]);
        }*/
        int g = n-2;
        for (int i = 0;i<n/3;i++) {
            
            sum=sum+piles[g];
            g=g-2;
        }
        return sum;
        }
        return piles[1];
    }
}