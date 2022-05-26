import java.util.Arrays;
import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(productmax(a));
    }

    private static int productmax(int[] a) {
        int curmin = 1, curmax = 1;
        int res = Arrays.stream(a).max().getAsInt();
        for(int num:a) {
            if(num==0){
                curmax = curmin = 1;
                continue;
            }
            int temp = curmax*num;
            curmax = Math.max(num*curmax,Math.max(num*curmin,num));
            curmin = Math.min(temp,Math.min(num*curmin,num));
            res = Math.max(res,curmax);
        }
        return res;
    }
}
