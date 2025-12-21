#include<bits/stdc++.h>
using namespace std;
int n,a,b;
vector<pair<int,int>>v;
int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		v.push_back({a,b});
	}
	int cnt =0;
	map<int,int>mp;
	for(int i=0;i<n;i++){
		cnt =1;
		for(int j=0;j<n;j++){
			
			if(i==j) continue;
			if(v[i].first<v[j].first&&
			v[i].second<v[j].second){
				cnt++;
			}
		}mp[i] =cnt;
	}
	for(int i=0;i<n;i++){
		cout<<mp[i]<<' ';
	}
}
				
		
		