#include<bits/stdc++.h>
using namespace std;
int t,n,temp;
string s;

int main(){
	cin>>t;
	while(t--){
		cin>>n;
		map<int,string>mp;
		int mx = -1;
		while(n--){
			cin>>s>>temp;
			mp[temp] = s;
			mx = max(mx,temp);	
		}
		for(auto i:mp){
			if(i.first==mx){
				cout<<i.second<<'\n';
			}
		}
	}
}
			