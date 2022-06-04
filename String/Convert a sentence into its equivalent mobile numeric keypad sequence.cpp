/******* BISMILLAHIR RAHMANIR RAHIM *******/

#include<bits/stdc++.h>
using namespace std;

#define endl "\n"
#define ll long long int
#define u unsigned
#define vii vector<ll>
#define pb push_back
#define all(x) x.begin(),x.end()
#define rall(x) x.rbegin(),x.rend()
#define sz size()
#define precision cout<<setprecision(10)<<fixed
#define tt int t;cin>>t;while(t--)
#define loop(n) for(int i=0;i<n;i++)
#define lop(a,n) for(int i=a;i<=n;i++)
#define rloop(n) for(int i=n-1;i>=0;i--)
#define read freopen("input.txt","r",stdin)
#define write freopen("output.txt","w",stdout)
#define ioboost ios_base::sync_with_stdio(false),cin.tie(NULL),cout.tie(NULL)
bool gre(ll a,ll b){return a>b;}

int32_t main()
{
    ioboost;
    string s;
    getline(cin,s);
    map<char,vector<int>> m;
    char c = 'A';
    m['A']={2,1};
    m['B']={2,2};
    m['C']={2,3};
    m['D']={3,1};
    m['E']={3,2};
    m['F']={3,3};
    m['G']={4,1};
    m['H']={4,2};
    m['I']={4,3};
    m['J']={5,1};
    m['K']={5,2};
    m['L']={5,3};
    m['M']={6,1};
    m['N']={6,2};
    m['O']={6,3};
    m['P']={7,1};
    m['Q']={7,2};
    m['R']={7,3};
    m['S']={7,4};
    m['T']={8,1};
    m['U']={8,2};
    m['V']={8,3};
    m['W']={9,1};
    m['X']={9,2};
    m['Y']={9,3};
    m['Z']={9,4};
    for(int i=0;i<s.size();i++) {
        vector<int> v = m[s[i]];
        if(s[i]==' '){
            cout<<0;
            continue;
        }
        for(int j=0;j<v[1];j++) cout<<v[0];
    }
    cout<<endl;
    return 0;
}

/*****************  ALHAMDULILLAH  *****************/


