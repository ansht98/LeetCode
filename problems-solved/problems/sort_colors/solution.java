class Solution {
    public void sortColors(int[] nums) {
        int r = 0;
        int b = 0;
        int w = 0;
        
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == 0)
            {
                r++;
            }
            if (nums[i] == 1)
            {
                w++;
            }
            if (nums[i] == 2) 
            {
                b++;
            }
        }
        for (int j = 0; j < r; j++)
        {
            nums[j] = 0;
        }
        for (int k = r; k < (w+r); k++)
        {
            nums[k] = 1;
        }
        for (int l = w+r; l < nums.length; l++)
        {
            nums[l] = 2;
        }
        
    }
}