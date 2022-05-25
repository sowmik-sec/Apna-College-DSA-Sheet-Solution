class Solution {
    public int maxProfit(int[] p) {
        int cur_min = p[0];
        int cur_max = p[0];
        int mx = 0;
        for(int i=1;i<p.length;i++) {
            if(p[i]>cur_max) {
                mx = Math.max(mx,p[i]-cur_min);
            }
            else if(p[i]<cur_min) {
                cur_min = p[i];
                cur_max = p[i];
            }
        }
        return mx;
    }
}