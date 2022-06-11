import java.util.Arrays;
import java.util.Scanner;

public class PairWithGivenDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int x = in.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        findPair(a,x);
    }

    private static void findPair(int[] a, int n) {
        int i = 0, j = 1;
        Arrays.sort(a);
        while(i<a.length && j<a.length) {
            if(i!=j && (a[j]-a[i]==n || a[i]-a[j]==n)) {
                System.out.println("Pair Found: ("+a[i]+", "+a[j]+")");
                return;
            }
            else if(a[j]-a[i]<n) j++;
            else i++;
        }
        System.out.println("No such pair!");

    }
}
