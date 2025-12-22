#include<bits/stdc++.h>
using namespace std;
const int max_n = 300004;
int visited[max_n];
vector<int>v[max_n];
vector<int>ret;
int n,m,k,x;
queue<int>q;

void bfs(int x){
	visited[x]=1;
	q.push(x);
	while(q.size()){
		int now = q.front();
		q.pop();
		
		for(int next:v[now]){
			if(visited[next]) continue;
			if(!visited[next]){
				visited[next]=visited[now]+1;
				q.push(next);
			}
		}
	}
}
		
int main(){
	cin>>n>>m>>k>>x;
	
	for(int i=0;i<m;i++){
		int a,b;
		cin>>a>>b;
		v[a].push_back(b);
	}
	
	bfs(x);
	
	
	for(int i=1;i<=n;i++){
//		cout<<visited[i]<<' ';
		if(visited[i]==k+1){
			ret.push_back(i);
		}
	}
	
	
	if(ret.size()){
		for(auto i:ret){
			cout<<i<<'\n';
		}
	}else cout<<-1;
}