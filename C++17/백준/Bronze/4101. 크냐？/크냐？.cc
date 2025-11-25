#include<bits/stdc++.h>
using namespace std;
int t,n,temp,a,b;
string s;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	while(true){
		cin>>a>>b;
		if(a==0) if(b==0) return 0;
		if(a>b) cout<<"Yes\n";
		else cout<<"No\n";
	}
}