import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int[]  a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(mostWater(a));
    }

    private static int mostWater(int[] a) {
        int l = 0, r = a.length-1;
        int leftmost = 0, rightmost = 0;
        int max = 0;
        while(l<r) {
            if(a[l]<=a[r]) {
                if(a[l]>leftmost) leftmost = a[l];
                max = Math.max(max,Math.min(a[l],a[r])*(r-l));
                l++;
            }
            else {
                if(a[r]>rightmost) rightmost = a[r];
                max = Math.max(max,Math.min(a[l],a[r])*(r-l));
                r--;
            }
        }
        return max;
    }
}
