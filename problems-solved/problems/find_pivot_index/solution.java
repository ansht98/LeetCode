class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
        if (n==1) {
            ans = 0;
        }
        if (n==2) {
            if (nums[0]==0){
                ans=1;
            }
            if (nums[1]==0){
                ans=0;
            }
        }
        if (n>2) {
            for (int i = 0; i<n;i++){
                int suml = 0;
                int sumr = 0;
                for (int j = i+1;j<n;j++){
                    sumr = sumr+nums[j];
                }
                for (int k = i-1;k>=0;k--) {
                    suml = suml+nums[k];
                }
                if (suml==sumr) {
                    ans = i;
                    break;
                }
            }
        }
        return ans;
    }
}