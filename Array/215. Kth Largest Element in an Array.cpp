class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        quick_sort(nums,0,nums.size()-1);
        return nums[k-1];
    }
    int partition(vector<int> &a, int l, int h) {
        int pivot = a[h];
        int i, j;
        for(i = l-1,j=l;j<h;j++) {
            if(a[j]>pivot) {
                i++;
                swap(a[i],a[j]);
            }
        }
        swap(a[i+1],a[h]);
        return i+1;
    }
    void quick_sort(vector<int> &a, int l, int h) {
        if(l>=h) return;
        int p = partition(a,l,h);
        quick_sort(a,l,p-1);
        quick_sort(a,p+1,h);
    }
};