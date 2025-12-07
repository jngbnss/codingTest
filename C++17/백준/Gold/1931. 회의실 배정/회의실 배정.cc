#include<bits/stdc++.h>
using namespace std;
long long n,k,ret,cnt,a,b;
vector<pair<int,int>>v;

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		v.push_back({b,a});
	}
	sort(v.begin(),v.end());
	cnt++;
	int start = v[0].second;
	int end = v[0].first;
	for(int i=1;i<v.size();i++){
		if(v[i].second>=end){
			cnt++;
			start = v[i].second;
			end = v[i].first;
		}
	}
	cout<<cnt;		
	
}
	