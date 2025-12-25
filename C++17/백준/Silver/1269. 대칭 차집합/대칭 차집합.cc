#include<bits/stdc++.h>
using namespace std;
int n,m;
int temp;
map<int,int>mp;

int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>temp;
		mp[temp]++;
	}
	
	for(int i=0;i<m;i++){
		cin>>temp;
		mp[temp]++;
	}
	
	int ret = n+m;
//	for(auto i:mp){
//		cout<<i.first<<' '<<i.second<<'\n';
//	}
	for(auto i:mp){
		if(i.second>=2) ret= ret-2;
	}
	cout<<ret;
}