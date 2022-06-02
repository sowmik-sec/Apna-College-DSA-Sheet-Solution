class Solution{
    public:
    string removeConsecutiveCharacter(string S)
    {
        string s;
        for(int i=0;i<S.size();i++) {
            if(i==0) s+=S[i];
            else if(s[s.size()-1]!=S[i]) s+=S[i];
        }
        return s;
    }
};