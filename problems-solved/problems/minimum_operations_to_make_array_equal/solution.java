class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i]=(2*i)+1;
        }
        int target = 0;
        int sum = 0;
        if (n%2==0) {
            target = arr[n/2]-1;
            for (int i = 0;i<n/2;i++) {
                sum = sum+(target-arr[i]);
            }
        }
        else {
            target = arr[n/2];
            for (int i = 0;i<n/2;i++) {
                sum = sum+(target-arr[i]);
            }
        }
        return sum;
    }
}