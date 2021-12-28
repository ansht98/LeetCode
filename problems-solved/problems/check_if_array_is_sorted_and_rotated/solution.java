class Solution {
    public boolean check(int[] nums) {
        int index = 0;
        int[] ar = new int[nums.length];
        for(int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                index = i+1;
                break;
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            ar[j] = nums[(index+j)%(nums.length)];
        }
        
        for (int k = 0; k < nums.length-1; k++) {
            if (ar[k] > ar[k+1]) {
                return false;
            }
        }
        return true;
    }
}