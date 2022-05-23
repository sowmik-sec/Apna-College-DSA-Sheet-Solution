import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(help(a,n,m));
    }

    private static int help(int[] a, int n, int m) {
        if(m==0 || n==0) return 0;
        if(n<m) return -1;
        Arrays.sort(a);
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i +m-1<n ; i++) {
            int diff = a[i+m-1]-a[i];
            if(diff<mn) mn = diff;
        }
        return mn;
    }
}