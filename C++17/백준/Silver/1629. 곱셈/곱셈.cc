#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll a,b,c,ret;

ll mod(ll a, ll b, ll c){
	if(b==0) return 1;
	ll half = mod(a,b/2,c);
	ret = (half*half)%c;
	if(b%2) ret = (ret*a)%c;
	return ret;
}


int main(){
	cin>>a>>b>>c;
	cout<<mod(a,b,c);
}