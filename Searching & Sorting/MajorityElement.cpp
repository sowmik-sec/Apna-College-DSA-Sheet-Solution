class Solution{
  public
      Function to find majority element in the array
     a input array
     size size of input array
    int majorityElement(int a[], int size)
    {
        
        mapint,int m;
        int mx = -1,ele=0;
        for(int i=0;isize;i++) {
            m[a[i]]++;
            int temp = m[a[i]];
            if(tempmx) {
                mx = temp;
                ele=a[i];
            }
        }
        if(mx(size2)) return ele;
        return -1;
    }
};
