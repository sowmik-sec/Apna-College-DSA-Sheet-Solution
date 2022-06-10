import java.util.Scanner;

public class Ceilinginasortedarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int index = ceilSearch(a,0,n-1,x);
        if(index == -1) System.out.println("Ceiling of "+x+" doesn't exist in array");
        else System.out.println("Ceiling of "+x+" is "+a[index]);
    }

    private static int ceilSearch(int[] a, int low, int high, int x) {
        if(a.length==0) return -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(x==a[mid]) return mid;
            if(x<a[mid]) high = mid-1;
            else low = mid + 1;
        }
        return low;
    }
}
