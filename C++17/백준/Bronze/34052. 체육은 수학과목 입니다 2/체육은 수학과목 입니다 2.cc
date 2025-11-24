#include<bits/stdc++.h>
using namespace std;
map<string,string>mp;
int n,ret=300;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	for(int i=0;i<4;i++){
		cin>>n;
		ret+=n;
	}
	if(ret>1800) cout<<"No";
	else cout<<"Yes";
		
}