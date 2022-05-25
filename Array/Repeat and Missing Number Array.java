public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.size();i++) {
            if(set.add(A.get(i))){continue;}
            else {
                res.add(A.get(i));
            }
        }
        for(int i=1;i<=A.size();i++) {
            if(set.contains(i)) continue;
            else res.add(i);
        }
        return res;
    }
}
