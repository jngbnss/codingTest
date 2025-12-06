#include<bits/stdc++.h>
using namespace std;
int a,b,c,n,m;
vector<int>v,ret;
map<int,int>mp;
int main(){
	for(int i=0;i<28;i++){
		cin>>n;
		mp[n]++;
	}
	for(int i=1;i<=30;i++){
		if(mp[i]==0){
			cout<<i<<'\n';
		}
	}
}