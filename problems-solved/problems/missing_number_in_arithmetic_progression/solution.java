class Solution {
    public int missingNumber(int[] arr) {
        int d = (arr[arr.length-1]-arr[0])/(arr.length);
        
        if (d != 0) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] != d) {
                return arr[i]+d;
            }
        }
        }
        return arr[0];
    }
}