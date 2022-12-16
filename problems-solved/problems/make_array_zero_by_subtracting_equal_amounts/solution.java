class Solution {
    public int minimumOperations(int[] nums) {        
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        
        int y = 0;
        for (int i = 0;i<n;i++) {
           int x = nums[i];
           if (x>0&&count == 0) {
               y = x;
               count++;
           }
           if (x>0&&count>0&&y!=x) {
               count++;
               y = x;
           }
        }
        return count;
    }
}