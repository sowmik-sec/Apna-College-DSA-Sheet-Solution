import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        reverse(a);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }

    private static void reverse(int[] a) {
        int i = 0, j = a.length-1;
        while(i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}