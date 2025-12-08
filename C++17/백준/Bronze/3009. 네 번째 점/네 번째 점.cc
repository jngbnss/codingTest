#include<bits/stdc++.h>
using namespace std;
int a,b;
map<int,int>mp,mp1;

int main(){
	cin>>a>>b;
	mp[a]++,mp1[b]++;
	cin>>a>>b;
	mp[a]++,mp1[b]++;
	cin>>a>>b;
	mp[a]++,mp1[b]++;
	
	for(auto i:mp){
		if(i.second==1) cout<<i.first<<' ';
	}
	
	for(auto i:mp1){
		if(i.second==1) cout<<i.first;
	}
}