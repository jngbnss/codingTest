#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,m,a,b;
ll psum[100004];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i=1;i<=n;i++){
		int temp;
		cin>>temp;
		psum[i] = psum[i-1]+temp;
	}
	
	for(int i=0;i<m;i++){
		cin>>a>>b;
		cout<<psum[b] -psum[a-1]<<'\n';
	}
}