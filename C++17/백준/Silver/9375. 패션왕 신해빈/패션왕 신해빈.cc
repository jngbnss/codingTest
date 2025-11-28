#include<bits/stdc++.h>
using namespace std;
int n,t,ret;
string s,temp;
vector<int>v;
int arr[26];


int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	
	cin>>t;
	while(t--){
		cin>>n;
		ret = 1;
		map<string,int>mp;
		for(int i=0;i<n;i++){
			cin>>temp>>s;
			mp[s]++;
		}
		for(auto i:mp){
			ret= ret * (i.second+1);
		}
		cout<<ret-1<<'\n';
	}
}

