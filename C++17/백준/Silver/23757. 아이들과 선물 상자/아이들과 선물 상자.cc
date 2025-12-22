#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,m,mx,temp;

priority_queue<int>pq;

int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	cin>>n>>m;
	for(ll i=0;i<n;i++){
		cin>>temp;
		pq.push(temp);
	}
	
	for(ll i=0;i<m;i++){
		cin>>temp;
		int box = pq.top();
		pq.pop();
		box-=temp;
		if(box<0){
			cout<<0;
			return 0;
		}
		pq.push(box);
		
	}
	cout<<1;
}