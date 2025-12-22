#include<bits/stdc++.h>
//ascending greater
using namespace std;
typedef long long ll;
ll n,temp;
priority_queue<ll,vector<ll>,greater<ll>>pq;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(ll i=0;i<n;i++){
		pq.push(-1e9);
	}
	
	for(ll i=0;i<n;i++){
		for(ll j=0;j<n;j++){
			cin>>temp;
			if(temp>pq.top()){
//				cout<<temp<<'\n';
				pq.pop();
				pq.push(temp);
			}
		}
	}
	
	cout<<pq.top()<<'\n';
}