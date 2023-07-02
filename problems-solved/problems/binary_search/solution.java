class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        
        while (l <= h) {
            
            if (nums[(l+h)/2] == target) {
                return (l+h)/2;
            }
            if (nums[(l+h)/2] > target) {
                h = ((l+h)/2)-1;
            }
            if (nums[(l+h)/2] < target) {
                l = ((l+h)/2)+1;
            }
        }
        return -1;
    }
}