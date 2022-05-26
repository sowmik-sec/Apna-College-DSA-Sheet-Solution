class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];
        int[] ans = new int[nums.length];
        int mul = 1;
        for(int i = 0;i<nums.length;i++) {
            mul *= nums[i];
            prefix[i] = mul;
        }
        mul = 1;
        for(int i=nums.length-1;i>=0;i--) {
            mul *= nums[i];
            sufix[i] = mul;
        }
        for(int i=0;i<nums.length;i++) {
            if(i==0) ans[i] = sufix[i+1];
            else if(i==nums.length-1) ans[i] = prefix[nums.length-2];
            else ans[i] = sufix[i+1]*prefix[i-1];
        }
        return ans;
    }
}