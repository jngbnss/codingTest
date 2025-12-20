#include<bits/stdc++.h>
using namespace std;
vector<int>arr[104];
int visited[104];
queue<int>q;
int n,a,b,y,x,ret;

void bfs(int y){
	visited[y] =1;
	q.push(y);
	while(q.size()){
		int now = q.front();
		q.pop();
		
		for(auto i:arr[now]){
			if(visited[i]) continue;
			visited[i] = visited[now]+1;
			q.push(i);
		}
	}
}
int main(){
	cin>>n;
	cin>>y>>x;
	int m;
	cin>>m;
	for(int i=0;i<m;i++){
		cin>>a>>b;
		arr[a].push_back(b);
		arr[b].push_back(a);
	}
	
	bfs(y);
	
//	for(int i=1;i<=n;i++){
//		cout<<visited[i]<<'\n';
//	}
	if(visited[x]!=0) cout<<visited[x]-1;
	else cout<<-1;
}