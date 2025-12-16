#include<bits/stdc++.h>
using namespace std;
int n,a,t;
map<int,int>mp;
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	while(n--){
		cin>>t;
		mp.clear();
		int mx =0;
		for(int i=0;i<t;i++){
			cin>>a;
			mp[a]++;
			mx = max(mx,mp[a]);
		}
		vector<int>v;
		for(auto i:mp){
			if(mx==i.second){
				v.push_back(i.first);
			}
		}
		sort(v.begin(),v.end());
		cout<<v[0]<<'\n';
	}
	
			
			
}