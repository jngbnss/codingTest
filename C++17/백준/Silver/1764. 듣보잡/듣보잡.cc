#include<bits/stdc++.h>
using namespace std;
int n,m;
string s;
map<string,int>mp;

int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>s;
		mp[s]++;
	}
	for(int i=0;i<m;i++){
		cin>>s;
		mp[s]++;
	}
	vector<string>v;
	for(auto i:mp){
		if(i.second>1){
			v.push_back(i.first);
			
		}
	}
	sort(v.begin(),v.end());
	cout<<v.size()<<"\n";
	for(auto i:v){
		cout<<i<<'\n';
	}
}