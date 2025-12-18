#include<bits/stdc++.h>
using namespace std;
int n,x;
vector<int>v,v1;
map<int,int>mp;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>x;
		v.push_back(x);
	}
	v1 = v;
	
	sort(v1.begin(),v1.end());
	int cnt =1;
	for(int i=0;i<n;i++){
		
		if(mp[v1[i]]==0){
			mp[v1[i]] = cnt++;
		}
	}
	for(auto i:v){
		cout<<mp[i]-1<<' ';
	}
}
		
		