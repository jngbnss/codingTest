#include<bits/stdc++.h>
using namespace std;
int n,ret,t;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>t;
	while(t--){
		cin>>n;
		ret=0;
		for(int i=5;i<=n;i*=5){
			ret+=n/i;
		}
		cout<<ret<<'\n';
	}
}