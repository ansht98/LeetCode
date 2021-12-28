class Solution {
    public boolean isMonotonic(int[] nums) {
        int count = 1;
        int max = 1;
        for (int i = 0; i < (nums.length-1); i++) {
            if (nums[i] <= nums[i+1]) {
                count++;
                
            
            }
             }
        
        for (int i = 0; i < (nums.length-1); i++) {
            if (nums[i] >= nums[i+1]) {
                max++;
            
            }
        }
        
        if (max == nums.length || count == nums.length ) {
            return true;
        }
        
        else {
            return false;
        }
    }
}