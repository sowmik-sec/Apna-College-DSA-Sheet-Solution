class Solution {
    int findMaxSum(int arr[], int n) {
        int[][] temp = new int[n][2];
        if(n==1) return arr[0];
        temp[0][0] = 0;
        temp[0][1] = arr[0];
        for(int i=1;i<n;i++) {
            temp[i][1] = temp[i-1][0] + arr[i];
            temp[i][0] = Math.max(temp[i-1][0],temp[i-1][1]);
        }
        return Math.max(temp[n-1][0],temp[n-1][1]);
    }
}
// Alhamdulillah