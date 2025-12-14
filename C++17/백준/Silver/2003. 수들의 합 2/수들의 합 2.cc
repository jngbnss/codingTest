#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,m,temp,ret;
ll psum[100004];

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(int i=1;i<=n;i++){
		cin>>temp;
		psum[i] = psum[i-1]+temp;
	}
//	for(int i=1;i<=n;i++){
//		cout<<psum[i]<<' ';
//	}
//	cout<<"===========\n";
	
	for(int i=1;i<=n;i++){
		for(int j=0;j<=i;j++){
			//cout<<i<<" psum[i]-psum[i-j] : "<<psum[i]<<" : "<<psum[i-j]<<" "<<psum[i]-psum[i-j]<<'\n';
			if(psum[i]-psum[i-j] == m){ 
				ret++;//cout<<ret++<<'\n';
				}
		}
	}
	cout<<ret;
}
		