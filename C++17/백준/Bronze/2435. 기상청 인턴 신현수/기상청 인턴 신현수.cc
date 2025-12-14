#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,k,temp,ret = -204;
ll psum[104];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		cin>>temp;
		psum[i] = psum[i-1]+temp;
	}
	for(int i=k;i<=n;i++){
//		cout<<i<<" : "<<psum[i]-psum[i-k]<<'\n';
		ret = max(ret,psum[i]-psum[i-k]);
	}
	cout<<ret;
}