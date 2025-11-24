#include<bits/stdc++.h>
using namespace std;
int n,ret,a,b,idx,mn=1e9,mx=-1e9;
string s;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	
	for(int i=0;i<n;i++){
		cin>>a>>s;
		for(auto j:s){
			for(int i=0;i<a;i++){
			cout<<j;
		}	
	}cout<<'\n';
}
}