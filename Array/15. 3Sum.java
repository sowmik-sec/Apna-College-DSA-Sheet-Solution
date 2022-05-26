import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        List<List<Integer>> ans = sum(a);
        System.out.println(ans);
    }

    private static List<List<Integer>> sum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        int n = a.length;
        for (int i = 0; i < n-2; i++) {
            if(i==0 || (a[i]!=a[i-1])) {
                int l = i+1,h = n-1, sum = 0-a[i];
                while(l<h) {
                    if(a[l]+a[h]==sum) {
                        ans.add(Arrays.asList(a[i],a[l],a[h]));
                        while(l<h && a[l]==a[l+1]) l++;
                        while(l<h && a[h]==a[h-1]) h--;
                        l++;h--;
                    }
                    else if(a[l]+a[h]<sum) l++;
                    else h--;
                }
            }
        }
        return ans;
    }
}
