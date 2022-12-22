class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int y = 1;
        
        if (nums[1]>=0) {
            y = nums[n-1]*nums[n-2]*nums[n-3];
            System.out.print("1");
        }
        else if (nums[n-1]==0) {
            System.out.print("2");
            return 0;
            
        }
        else if (nums[n-1]<0) {
            System.out.print("3");
            return nums[n-1]*nums[n-2]*nums[n-3];
            
        }
        else {
            int a = nums[0]*nums[1];
            int b = nums[n-2]*nums[n-3];
            if (a>b) {
                y=nums[n-1]*a;
            }
            else {
                y=nums[n-1]*b;
            }
            System.out.print("4");
        }
        return y;
    }
}