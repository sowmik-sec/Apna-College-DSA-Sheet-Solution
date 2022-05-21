class Solution {
    public int maxSubArray(int[] nums) {
        int ans = help(nums);
        return ans;
    }
    static int help(int[] a) {
        int max_so_far = Integer.MIN_VALUE, max_ends_here = 0;
        for (int i = 0; i < a.length; i++) {
            max_ends_here += a[i];
            if(max_so_far<max_ends_here) max_so_far = max_ends_here;
            if(max_ends_here<0) max_ends_here = 0;
        }
        return max_so_far;
    }
}