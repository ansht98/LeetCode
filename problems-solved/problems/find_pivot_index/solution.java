class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0]=nums[0];
        for (int i = 1;i<n;i++) {
            ans[i]=nums[i]+ans[i-1];
        }
        int suml = 0;
        int sumr = 0;
        
        for (int i = 0;i<n;i++) {
            if (i==0) {
                suml = 0;
                sumr = ans[n-1]-ans[0];
                if (suml==sumr) {
                    return i;
                    
                }
            }
            else if (i==n-1) {
                sumr = 0;
                suml = ans[n-2];
                if (suml==sumr) {
                    return i;
                    
                }
            }
            else {
                suml = ans[i-1];
                sumr = ans[n-1]-ans[i];
                if (suml==sumr) {
                    return i;
                    
                }
            }
        }
        return -1;
    }
}