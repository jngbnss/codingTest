#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,m,a,b,temp,ret;
ll arr[100004],sum[100004];

int main(){
	cin>>n>>m;
	
	for(ll i=0;i<n;i++){
		cin>>temp;
		arr[i] = temp;
	}
	
	for(ll i=0;i<m;i++){
		sum[0]+=arr[i];
	}
	ret = sum[0];
	for(ll i=1;i<=n-m;i++){
//		cout<<sum[i-1];
		sum[i] = sum[i-1]+arr[i+m-1]-arr[i-1];
		ret = max(ret,sum[i]);
//		cout<<'\n';
	}
//	for(ll i=0;i<n-m;i++){
//		cout<<sum[i]<<'\n';
//	}
	cout<<ret;
	
	
	 
}