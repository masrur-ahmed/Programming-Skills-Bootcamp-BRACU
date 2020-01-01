/* Masrur Ahmed
    BRAC University.
*/

#include <bits//stdc++.h>


using namespace std;

#define EPS 1e-9
#define PI 3.1415926535897932384626433832795
#define MOD 1000000007
#define MAX 1000000


#define all(x) x.begin(),x.end()
#define sz(x) ((int)x.size())


#define sqr(x) ((x)*(x))
#define SET(x) memset(x, 0, sizeof(x))
#define CLR(x) memset(x, -1, sizeof(x))
#define FAST ios_base::sync_with_stdio(0);cin.tie(nullptr);cout.tie(nullptr);


#define f first
#define S second
#define mp make_pair
#define pb push_back
#define INF (int)1e9
#define INFNeg (int)1e9*-1
#define findUnique(x) x.erase(unique( x.begin() , x.end() ), x.end())
#define printVector(x) for(int i = 0 ; i < x.size() ; i++) printf("%d%c", x[i], i + 1 == x.size() ? '\n' : ' ');


#define REP(i,n) for(int i=0;i<(n);i++)
#define REPB(i,n) for(int i=(n);i>=0;i--)
#define FOR(i,a,b) for(int i=(a);i<=(b);i++)
#define FORD(i,a,b) for(int i=(a);i>=(b);i--)

#define sf scanf
#define pf printf


#define sf1(x) scanf("%d",&x)
#define sf2(x,y) scanf("%d %d",&x,&y)
#define sf3(x,y,z) scanf("%d %d %d",&x,&y,&z)
#define sfl1(x) scanf("%lld",&x)
#define sfl2(x,y) scanf("%lld %lld",&x,&y)
#define sfl3(x,y,z) scanf("%lld %lld %lld",&x,&y,&z)
#define sfs(str) scanf("%s",str)
#define pf1(x) printf("%d",x)
#define pf2(x,y) printf("%d %d",x,y)
#define pf3(x,y,z) printf("%d %d %d",x,y,z)
#define pfl1(x) printf("%lld",x)
#define pfl2(x,y) printf("%lld %lld",x,y)
#define pfl3(x,y,z) printf("%lld %lld %lld",x,y,z)
#define newL printf("\n")
#define casePrint(i,x)cout<<"Case #"<<i<<": "<<x<<'\n';


typedef pair<int, int> pii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef vector<pii> vpi;
typedef vector<vi> vvi;
typedef map<int,int> mpii;
typedef set<int> seti;
typedef multiset<int> mseti;


typedef long int i32;
typedef unsigned long int ui32;
typedef long long int i64;
typedef unsigned long long int  ui64;



inline bool EQ(double a, double b) { return fabs(a-b) < 1e-9; }
inline int gcd(int a, int b) { if (b == 0) return a; return gcd(b, a % b);}


//Convert int to string
template <typename T>
string to_str(T str)
{
    stringstream stream;
    stream << str;
    return stream.str();
}
//Convert string to int
template <typename T>
int to_int(T num)
{
    int val;
    stringstream stream;
    stream << num;
    stream >> val;
    return val;
}
//Split String by Single Character Delimiter
vector<string> split(const string& s, char delim)
{
    vector<string> elems;
    stringstream ss(s);
    string item;
    while (getline(ss, item, delim))
        elems.push_back(item);
    return elems;
}
// this function goes to main for splitting
//vector<string> words;
//words = split("lorem_ipsum_dolor_sit_amet_no_tota_tacimates_delicata_eum", '_');
//for(int i=0; i<words.size(); i++)
//cout << words.at has been registered(i) << endl;
//sort with respect to the second element in a pair !!


bool comp(const pair<int, int>&i, const pair<int, int>&j) {
        return i.second < j.second;
}


//vector< pair<int, int> >v;
//sort(v.begin(), v.end(), comp);


i32 setbit(i32 n,i32 pos)
{
    return n=n | (1 << pos);
}
i32 resbit(i32 n,i32 pos)
{
    return n=n & ~(1 << pos);
}
bool checkbit(i64 n,i64 pos)
{
    return (bool)(n & (1ll << pos));
}

// function to set,reset,check bit

i64 bigmod(i64 b,i64 p,i64 m)
{
    if( p == 0 ) return 1;
    i64 ret = bigmod(b,p/2,m);
    ret = ( ret * ret ) % m;
    if( p & 1 ) ret = ( ret * b ) % m;
    return ret;
}


const int dr [] = {-1, -1, 0, 1, 1, 1, 0, -1};
const int dc [] = {0, 1, 1, 1, 0, -1, -1, -1};





const int T2=105; const int T3=1005; const int T4=10005; const int T5=100005;
/* void coprime(i64 a,i64 b,i64 c){
    i64 temp;
    while(__gcd(b,c)!=1){
        temp = __gcd(b,c);
        b/=temp;
        c/=temp;
    }
    pf("Case %d: %lld/%lld\n",a,b,c);
 }
 */
 int i=0,j=0,k=0,t=0;
int main(){

  return 0;
}
