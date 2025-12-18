#include<bits/stdc++.h>
using namespace std;
int n;
string s;
vector<string>v;
map<string,int>mp;

bool cmp(string a,string b){
	if(mp[a]==mp[b]){
		return a<b;
	}
	return mp[a]<mp[b];
}
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		
		if(mp[s]==0){
			v.push_back(s);
			mp[s] = s.size();
		}
	}
	
//	for(auto i:size){
//		cout<<i.first<<" : "<<i.second<<'\n';
//	}
	
	sort(v.begin(),v.end(),cmp);
	for(auto i:v){
		cout<<i<<'\n';
	}
}