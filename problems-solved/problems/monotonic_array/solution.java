class Solution {
    public boolean isMonotonic(int[] nums) {
        int count = 1;
         int count1 = 1;
        int max = 1;
        int max1 = 1;
        for (int i = 0; i < (nums.length-1); i++) {
            if (nums[i] <= nums[i+1]) {
                count++;
            }
             else {
                    count1++;
                }
            
        }
        
        for (int i = 0; i < (nums.length-1); i++) {
            if (nums[i] >= nums[i+1]) {
                max++;
            }
            else {
                max1++;
            }
        }
        
       
        
        if (max == nums.length && max1 == 1) {
            return true;
        }
        
        else if (count == nums.length && count1 == 1) {
            return true;
        }
        
        else {
            return false;
        }
    }
}