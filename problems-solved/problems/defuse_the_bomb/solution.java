class Solution {
    public int[] decrypt(int[] code, int k) {
      int n =  code.length; 
        int[] ar = new int[n];
        int sum = 0;
        if ( k > 0) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < k; j++) {
                    sum = sum + code[(1+(i+j))%n];
                }
                ar[i] = sum;
                sum = 0;
            }
        }
        if ( k < 0) {
           for(int i=0; i<code.length; i++){
                int l = i;
                int sum1 = 0;
                for(int j = 0; j< -k; j++){
                    l--;
                    if(l < 0)
                       l = code.length-1;
                    sum1 += code[l];
                }
                ar[i] = sum1;
            }
        }
        if (k == 0) {
            for(int b = 0; b < n; b++){
                ar[b] = 0;
            }
        }
        
      for(int c = 0; c < n; c++) {
          code[c] = ar[c];
      }
       return code; 
    }
}