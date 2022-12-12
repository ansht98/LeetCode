class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0;i<n;i++) {
            for (int j = i+1;j<n;j++){
                if ((nums[i]-1)*(nums[j]-1)>max) {
                    max = (nums[i]-1)*(nums[j]-1);
                }}
            for (int k = i-1;k>=0;k--){
                if ((nums[i]-1)*(nums[k]-1)>max) {
                    max = (nums[i]-1)*(nums[k]-1);
                }
            }
        }
        return max;
    }
}