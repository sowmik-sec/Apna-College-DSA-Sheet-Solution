class Solution {
    public int search(int[] nums, int target) {
        int ans = search(nums,target,0,nums.length-1);
        return ans;
    }
    static int search(int[] a, int key,int s, int e) {
        if(s>e) return -1;
        int m = s + (e-s)/2;
        if(a[m]==key) return m;
        if(a[s]<=a[m]) {
            if(key>=a[s] && key<=a[m]) return search(a,key,s,m-1);
            else return search(a,key,m+1,e);
        }
        else if(a[m]<=a[e]) {
            if(key>=a[m] && key<=a[e]) return search(a,key,m+1,e);
        }
        return search(a,key,s,m-1);
    }
}