class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[(n/2)+1];
        int count = 0;
        int x = 0;
        for (int i = 0;i<n;i++) {
            count = 0;
            
            for (int j = 0;j<n;j++) {
                if (nums[j]==nums[i]){
                    count++;
                    x = i;
                }
            }
            if (count>n/2) {
                break;
               
            }
        }
        return nums[x];
    }
}