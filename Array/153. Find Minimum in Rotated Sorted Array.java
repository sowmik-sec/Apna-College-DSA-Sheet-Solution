import java.util.Scanner;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] a = {11,13,15,17};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(min(a,0,n-1));
    }

    private static int min(int[] a, int l, int r) {
        int m = l + (r-l)/2;
        if(m-1>=0 && m+1<a.length && a[m]<a[m-1] && a[m]<a[m+1]) return a[m];
        if(m+1<a.length && a[m+1]<a[m]) return a[m+1];
        if(m==0) return a[m];
        if(a[l]<=a[m]) {
            if(a[m]<a[r]) return min(a,l,m-1);
            else return min(a,m+1,r);
        }
        return min(a,l,m-1);
    }
}
