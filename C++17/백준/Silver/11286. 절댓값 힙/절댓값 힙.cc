// ascending
#include<bits/stdc++.h>
using namespace std;
typedef int ll;
ll n,x;
//greater

//bool cmp(ll a,ll b){
//	if(abs(a)==abs(b)){
//		return a<b;
//	}
//	return abs(a)<abs(b);
//}
struct cmp{
	bool operator()(int a,int b){
		if(abs(a)==abs(b)){
			return a>b;
		}
		return abs(a)>abs(b);
	}
};
priority_queue<ll,vector<ll>,cmp>pq;

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