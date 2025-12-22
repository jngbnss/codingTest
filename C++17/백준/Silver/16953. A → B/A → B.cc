#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
ll n,k,cnt;
const ll max_n = 1e9;
//int arr[max_n],visited[max_n];
map<ll,int>visited;

int main(){
	cin>>n>>k;
	queue<int>q;
	q.push(n);
	visited[n]=1;
	while(q.size()){
		ll now =  q.front();
		q.pop();
		for(ll next : {now*2,now*10+1}){
			if(next>=max_n) continue;
			if(!visited[next]){
				visited[next]=visited[now]+1;
				q.push(next);
			}
		}
	}
//	for(ll i=0;i<100;i++){
//		cout<<i<<":"<<visited[i]<<'\n';
//	}
	
	if(visited[k]!=0) cout<<visited[k];
	else cout<<-1;
}