class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s.length==0 || s==null) return "";
        String pre = s[0];
        int i = 1;
        while(i<s.length) {
            while(s[i].indexOf(pre)!=0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}