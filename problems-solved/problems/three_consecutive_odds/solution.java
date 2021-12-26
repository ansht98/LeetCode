class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int boo = 0;
        for (int i = 0; i < arr.length-2; i++) {
            
            if (arr[i]%2 == 1 && arr[i+1]%2 == 1 && arr[i+2]%2 == 1) {
               boo = 1;
                break;
            }
            
        }
        if ( boo == 1) {
            return true;
        }
        
        else {
            return false;
        }
    }
}