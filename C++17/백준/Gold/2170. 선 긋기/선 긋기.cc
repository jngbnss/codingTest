#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,a,b,ret;
vector<pair<int,int>>v;

bool cmp(pair<int,int>a,pair<int,int>b){
	if(a.first == b.first){
		return a.second>b.second;
	}
	return a.first<b.first;
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>a>>b;
		v.push_back({a,b});
	}
	
	sort(v.begin(),v.end(),cmp);
	
//	for(auto i:v){
//		cout<<i.first<<' '<<i.second<<'\n';
//	}
	
	ll start = v[0].first; //start;
	ll next = v[0].second;
	long long length = 0;
	for(int i=1;i<n;i++){
		ll newStart = v[i].first;
		ll newEnd = v[i].second;
		
		if(newStart<next&&next>=newEnd) continue;
		else if(newStart<= next&&next<newEnd){
			next = newEnd;
		}
		else if(next<newStart){
			length =next-start;
			ret+=length;
			
			start = newStart;
			next = newEnd;
		}
	}
	length = next-start;
	ret+=length;
	cout<<ret;
}
	
			
		