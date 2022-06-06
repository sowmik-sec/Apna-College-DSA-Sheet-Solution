import java.util.Scanner;


public class PermuteTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        boolean ans = permute(a,b,k);
        System.out.println(ans);
    }

    private static boolean permute(int[] a, int[] b,int k) {
        merge_sort(a,0,a.length);
        quick_sort(b,0,b.length-1);
        for(int num:a) System.out.print(num+" ");
        System.out.println();
        for(int num:b) System.out.print(num+" ");
        for(int i=0;i<a.length;i++) {
            if(a[i]+b[i]<k) return false;
        }
        return true;
    }

    private static void quick_sort(int[] b, int s, int e) {
        if(s>=e) return;
        int p = partition(b,s,e);
        quick_sort(b,s,p-1);
        quick_sort(b,p+1,e);
    }

    private static int partition(int[] b, int s, int e) {
        int i,j;
        for(i = s, j=s-1;i<e;i++) {
            if(b[i]>b[e]) {
                ++j;
                swap(b,i,j);
            }
        }
        swap(b,e,j+1);
        return j+1;
    }

    private static void swap(int[] b, int i, int j) {
        int temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }

    private static void merge_sort(int[] a, int l, int r) {
        if(r-l==1) return;
        int m = l + (r-l)/2;
        merge_sort(a,l,m);
        merge_sort(a,m,r);
        merge(a,l,m,r);
    }

    private static void merge(int[] a, int l, int m, int r) {
        int i = l, j = m, k = 0;
        int[] temp = new int[r-l];
        while(i<m && j<r) {
            if(a[i]<a[j]) temp[k++] = a[i++];
            else temp[k++] = a[j++];
        }
        while(i<m) temp[k++] = a[i++];
        while(j<r) temp[k++] = a[j++];
        k=0;
        for(int index = l;index<r;index++,k++) {
            a[index] = temp[k];
        }
    }
}
