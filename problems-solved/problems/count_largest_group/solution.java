class Solution {
    public int countLargestGroup(int n) {
        int[] arr = new int[100];
        int num = n;
        int sum = 0;
        int count = 1;
        for (int i = 1;i<n+1;i++) {
            num=i;
            while (num!=0) {
                sum=sum+num%10;
                num = num/10;
            }
            arr[sum]++;
            sum=0;
        }
        Arrays.sort(arr);
        int a = 99;
        while ((arr[a]==arr[a-1])) {
            if (arr[a]!=0) {
                count++;
            }
            a--;
        }
        return count;
    }
}