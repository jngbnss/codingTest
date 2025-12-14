#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,k,b,temp,ret = 1e9;
ll psum[100004],arr[100004];
vector<ll>v;

int main(){
	cin>>n>>k>>b;
	for(ll i = 0;i<b;i++){
		cin>>temp;
		arr[temp] = 1;
	}
	
	for(ll i=1;i<=n;i++){
		psum[i] = psum[i-1]+arr[i];
	}
	for(int i=k;i<=n;i++){
//		cout<<i<<" : "<<psum[i]-psum[i-k]<<'\n';
		ret = min(ret,psum[i]-psum[i-k]);
		
	}
	cout<<ret;
}
		