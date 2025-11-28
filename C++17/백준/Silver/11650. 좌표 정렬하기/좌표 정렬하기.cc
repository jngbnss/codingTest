#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp;
string s;
map<int,int>mp;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	int a,b;
	vector<pair<int,int>>v;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		v.push_back({a,b});
	}
	sort(v.begin(),v.end());
	for(auto i:v){
		cout<<i.first<<' '<<i.second<<'\n';
	}
		
}