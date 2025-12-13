#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,k,ret=-10000004,temp;
ll psum[100004];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n>>k;
	for(int i=1;i<=n;i++){
		cin>>temp;
		psum[i] = psum[i-1]+temp;
	}
	for(int i=k;i<=n;i++){
		ret = max(ret,psum[i]-psum[i-k]);
	}cout<<ret;
}
		