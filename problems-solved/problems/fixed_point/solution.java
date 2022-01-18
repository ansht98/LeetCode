class Solution {
    public int fixedPoint(int[] arr) {
       //agar mid pe mil gaya to neeche jao
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] == mid) {
              ans = mid;
                high = mid-1;
            }
            if (mid<arr[mid]) {
                high = mid-1;
            }
            if (mid > arr[mid]) {
                low = mid+1;
            }
        }
        return ans;
    }
}