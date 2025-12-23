#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,k,m,v,c;

int main(){
	cin>>n>>k;
	vector<pair<ll,ll>>gold(n);
	vector<ll>bag(k);
	
	for(int i=0;i<n;i++){
		cin>>gold[i].first>>gold[i].second;
	}
	for(int i=0;i<k;i++){
		cin>>bag[i];
	}
	
	priority_queue<ll>pq;
	sort(gold.begin(),gold.end());
	sort(bag.begin(),bag.end());
	
	ll ret=0;
	
	int goldIndex=0;
	for(int bagIndex=0;bagIndex<k;bagIndex++){
		while(goldIndex<n&&gold[goldIndex].first<=bag[bagIndex]){
			pq.push(gold[goldIndex++].second);
		}
		if(pq.size()){
			ret+=pq.top();
			pq.pop();
		}
	}
	cout<<ret;
}