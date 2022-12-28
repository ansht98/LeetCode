class Solution {
    public int[] sortArrayByParity(int[] nums) {
        /*int n = nums.length;
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
        return ans3;*/
        //Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        while (i<j) {
            if (nums[i]%2==0&&nums[j]%2==1) {
                i++;
                j--;
            }
            else if (nums[i]%2==1&&nums[j]%2==0) {
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if (nums[i]%2==1&&nums[j]%2==1) {
                j--;
            }
            else if (nums[i]%2==0&&nums[j]%2==0) {
                i++;
            }
        }
        return nums;
    }
}