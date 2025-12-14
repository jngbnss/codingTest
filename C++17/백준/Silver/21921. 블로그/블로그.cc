#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,x,temp,ret = -1,cnt=0;
ll psum[250005];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>x;
	for(int i=1;i<=n;i++){
		cin>>temp;
		psum[i] = psum[i-1]+temp;
	}
	
	for(ll i=x;i<=n;i++){
		ll cur = (psum[i]-psum[i-x]);
		if(cur>ret){
			ret = cur;
			cnt = 1;
		}else if(cur == ret){
			cnt++;
		}
	}
	if(ret<=0){
		cout<<"SAD";
	}
	else cout<<ret<<'\n'<<cnt;
}
		
		