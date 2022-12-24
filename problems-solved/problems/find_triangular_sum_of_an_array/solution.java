class Solution {
    public int triangularSum(int[] nums) {
        int[] arrr = new int[nums.length];
        int n = nums.length;
        int count = 0;
        int n1 = n;
        int[] temp = new int[n];
        for (int i = 0;i<n;i++) {
            temp[i]=nums[i];           
        }
        int[] B = new int[n];
        for (int i = 0;i<n;i++) {
            for (int j = 0;j<n1-1;j++) {
                B[j]=(temp[j]+temp[j+1])%10;
            }
            for (int j = 0;j<n1-1;j++) {
                temp[j]=B[j];
                
            }
            
            n1--;
        }
            return temp[0];
    }
}