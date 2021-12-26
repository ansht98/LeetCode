class Solution {
    public int findSpecialInteger(int[] arr) {
        ////
        
        int count = 1;
        int a = arr[0];
        for (int i = 0; i< arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
                if ((count*4) >= arr.length) {
                    a = arr[i];
                }
            }
            else  {
                count = 1;
            }
        }
        ////    
        return a;
    } 
        
}