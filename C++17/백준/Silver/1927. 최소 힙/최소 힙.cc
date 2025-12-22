// ascending
#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,x;
//greater
priority_queue<ll,vector<ll>,greater<ll>>pq;

int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>x;
		if(x==0){
			if(pq.size()){
				cout<<pq.top()<<'\n';
				pq.pop();
			}else cout<<0<<'\n';
		}else pq.push(x);
	}
}