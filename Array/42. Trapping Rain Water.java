package apna_college.array;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //System.out.println(sol1(a));
        //System.out.println(sol2(a));
        System.out.println(sol3(a));
    }

    private static int sol3(int[] a) {
        int left = 0, right = a.length-1;
        int leftmax = 0, rightmax = 0, res = 0;
        while(left<=right) {
            if(a[left]<=a[right]) {
                if(a[left]>leftmax) leftmax = a[left];
                else res += leftmax - a[left];
                left++;
            }
            else {
                if(a[right]>rightmax) rightmax = a[right];
                else res += rightmax - a[right];
                right--;
            }
        }
        return res;
    }

    private static int sol2(int[] a) {
        int[] leftmax = new int[a.length];
        int[] rightmax = new int[a.length];
        int ans = 0;
        leftmax[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            leftmax[i] = Math.max(a[i],leftmax[i-1]);
        }
        rightmax[a.length-1] = a[a.length-1];
        for (int i = a.length-2; i >=0 ; i--) {
            rightmax[i] = Math.max(a[i],rightmax[i+1]);
        }
        for (int i = 0; i < a.length; i++) {
            int temp = Math.min(leftmax[i],rightmax[i]) - a[i];
            if(temp>0) ans+=temp;
        }
        return ans;
    }

    private static int sol1(int[] a) {
        int res = 0;
        for(int i=1;i<a.length-1;i++) {
            int leftmax = Integer.MIN_VALUE, rightmax = Integer.MIN_VALUE;
            for(int j=i-1;j>=0;j--) {
                leftmax = Math.max(leftmax,a[j]);
            }
            for(int j = i+1;j<a.length;j++) {
                rightmax = Math.max(rightmax,a[j]);
            }
            int temp = Math.min(leftmax,rightmax)-a[i];
            if(temp>0) res += temp;
            //System.out.println(a[i]+" "+leftmax+" "+rightmax+" "+" "+temp+" "+res);
        }
        return res;
    }
}
