// asce greater
#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,m;
priority_queue<ll,vector<ll>,greater<ll>>pq;

int main(){
	cin>>n>>m;
	for(ll i=0;i<n;i++){
		ll temp;
		cin>>temp;
		pq.push(temp);
	}
	
	for(ll i=0;i<m;i++){
		ll a = pq.top();
		pq.pop();
		ll b = pq.top();
		pq.pop();
		ll c = a+b;
		pq.push(c);pq.push(c);
	}
	ll ret =0;
	for(ll i=0;i<n;i++){
		ret+=pq.top();
		pq.pop();
	}
	cout<<ret;
}