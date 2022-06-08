import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = in.nextInt();
        }
        int n3 = in.nextInt();
        int[] c = new int[n3];
        for (int i = 0; i < n3; i++) {
            c[i] = in.nextInt();
        }
        System.out.println(commonElements(a,b,c,n1,n2,n3));
    }

    private static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0, k = 0;
        int prev1, prev2, prev3;
        prev1 = prev2 = prev3 = Integer.MIN_VALUE;
        while(i<n1 && j<n2 && k<n3) {
            while(i<n1 && A[i]==prev1) i++;
            while(j<n2 && B[i]==prev2) j++;
            while(k<n3 && C[i]==prev3) k++;
            if(i<n1 && j<n2 && k<n3) {
                if(A[i]==B[j] && B[j]==C[k]) {
                    ans.add(A[i]);
                    prev1 = A[i];
                    prev2 = B[j];
                    prev3 = C[k];
                    i++;j++;k++;
                }
                else if(A[i]<B[j]) i++;
                else if(B[j]<C[k]) j++;
                else k++;
            }
        }
        return ans;
    }
}
