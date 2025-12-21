#include<bits/stdc++.h>
using namespace std;
int n;
string s;
map<string,int>mp;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		string temp;
		cin>>temp;
		if(temp=="enter"){
			mp[s]++;
		}else mp[s]--;
	}
	vector<string>v;
	for(auto i:mp){
		if(i.second>0){
			v.push_back(i.first);
		}
	}
	sort(v.rbegin(),v.rend());
	for(auto i:v){
		cout<<i<<'\n';
	}
}