class Solution {
    public int maxProfit(int[] prices) {
        /*int n = prices.length;
        int max= 0;
        for (int i = n-1;i>=0;i--) {
            for (int j = i-1;j>=0;j--) {
                if (prices[i]-prices[j]>max) {
                    max=prices[i]-prices[j];
                }
            }
        }
        return max;*/
        int min = Integer.MAX_VALUE;
        
        int max = 0;
        for (int i =0;i<prices.length-1;i++) {
            if (prices[i]<min) {
                min = prices[i];
            }
        if (prices[i+1]-min>max) {
            max = prices[i+1]-min;
        }
        }
        return max;
    }
}