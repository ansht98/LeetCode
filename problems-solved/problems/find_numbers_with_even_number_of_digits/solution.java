class Solution {
    public int findNumbers(int[] nums) {
        int digit = 0;
         for (int i = 0; i <nums.length; i++) {
          int count = 0;
          int number = nums[i];
          while (number >= 10) {
             number = number/10;
              count++;  
          }
          if (count%2 == 1) {
              digit++;
          }
      }
        
        return digit;
    }
}