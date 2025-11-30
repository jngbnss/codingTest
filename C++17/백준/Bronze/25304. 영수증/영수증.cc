#include<bits/stdc++.h>
using namespace std;
int n,a,b,c,ret,x;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>x;
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		ret+= a*b;
	}
	if(x==ret) cout<<"Yes";
	else cout<<"No";

}