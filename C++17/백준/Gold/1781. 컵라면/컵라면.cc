#include<bits/stdc++.h>
using namespace std;
int n,d,c;

int main(){
	cin>>n;
	vector<pair<int,int>>v;
	for(int i=0;i<n;i++){
		int a,b;
		cin>>a>>b;
		v.push_back({a,b});
		
	}
	sort(v.begin(),v.end());
	for(auto i:v){
//		cout<<i.first<<' '<<i.second<<'\n';
	}
	priority_queue<int,vector<int>,greater<int>>pq;
	for(int i=0;i<n;i++){
		pq.push(v[i].second);
		if(pq.size()>v[i].first){
			pq.pop();
		}
	}
	int ret =0;
	while(pq.size()){
		ret+=pq.top();
		pq.pop();
	}
	cout<<ret;
	
}