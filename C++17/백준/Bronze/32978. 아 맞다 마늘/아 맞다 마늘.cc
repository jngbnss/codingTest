#include<bits/stdc++.h>
using namespace std;
int n;
string s;
map<string,int>mp;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		mp[s]++;
	}
	for(int i=0;i<n-1;i++){
		cin>>s;
		mp[s]++;
	}
	for(auto i:mp){
		if(i.second==1){
			cout<<i.first;
		}
	}
}