class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int a = (n)/2;
        int[] ans = new int[a];
        int sum = 0;
        int k = 0;
        for (int h=0;h<a;h++){
            sum=sum+nums[h*2];
        }
        int[] sums = new int[sum];
        for (int i = 0; i < a; i++) {
            int c = nums[i*2];
            
            for (int j = k; j < k+c; j++){
                int x = (i*2)+1;
                sums[j] = nums[x];
            }
            k=k+c;
        }
            return sums;
        
    }
}