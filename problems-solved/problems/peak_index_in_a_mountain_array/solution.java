class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        
        while(low <= high) {
            
            if (arr[mid+1] < arr[mid ] && arr[mid-1] < arr[mid]){
                return mid;
            }
            if (arr[mid-1] > arr[mid] ) {
                high = mid;
            }
            if (arr[mid+1] > arr[mid] ) {
                low = mid;
            } 
            mid = (low+high)/2;
        }
        return -1;
    }
}