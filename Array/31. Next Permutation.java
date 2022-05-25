class Solution {
    public void nextPermutation(int[] a) {
        int mn1 = Integer.MAX_VALUE, mn2 = Integer.MAX_VALUE;
        int in1=-1, in2=-1;
        for(int i = a.length-2;i>=0;i--) {
            if(a[i]<a[i+1]) {
                in1 = i;
                break;
            }
        }
        if(in1==-1) {
            reverse(a,0,a.length-1);
        }
        else {
            for(int i=a.length-1;i>in1;i--) {
                if(a[i]>a[in1]) {
                    in2 = i;
                    break;
                }
            }
            if(in1!=-1 && in2!=-1) {
                int temp = a[in1];
                a[in1] = a[in2];
                a[in2] = temp;
            }
            reverse(a,in1+1,a.length-1);
        }
        
    }
    void reverse(int[] a, int i, int j) {
        while(i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}