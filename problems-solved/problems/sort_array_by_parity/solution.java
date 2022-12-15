class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int j = n-1;
        int temp = 0;
        int even = 0;
        
        
        int[] ans3 = new int[n];
        int x = n-1;
        for (int i = 0;i<n;i++) {
            if (nums[i]%2==0) {
                
                
                ans3[even]=nums[i];
                even++;
            }
            if (nums[i]%2==1) {
                
                ans3[x]=nums[i];
                x--;
            }
        }
        return ans3;
    }
}