package apna_college;

import java.util.Scanner;

public class RBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int key = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(search(a,key,0,n-1));
    }

    private static int search(int[] a, int key,int s, int e) {
        if(s>e) return -1;
        int m = s + (e-s)/2;
        if(a[m]==key) return m;
        if(a[s]<=a[m]) {
            if(key>=a[s] && key<=a[m]) return search(a,key,s,m-1);
            else return search(a,key,m+1,e);
        }
        else if(a[m]<=a[e]) {
            if(key>=a[m] && key<=a[e]) return search(a,key,m+1,e);
        }
        return search(a,key,s,m-1);
    }
}
