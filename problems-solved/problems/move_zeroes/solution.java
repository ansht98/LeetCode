class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {      
                ans[count] = nums[i];
                count++;
            }
        }
        for (int j = 0; j < n;j++) {
            if (j<=count) {
                nums[j]=ans[j];

            }
            else {
                nums[j]=0;
            }
        }
    }
}