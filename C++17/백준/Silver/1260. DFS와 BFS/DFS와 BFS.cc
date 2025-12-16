#include<bits/stdc++.h>
using namespace std;
int n,m,v;
int a,b;
int arr[1004][1004],visited[1004];
queue<int>q;

void dfs(int v){
	visited[v] = 1;
	cout<<v<<' ';
	
	for(int i =0;i<=n;i++){
		if(arr[v][i]==1&&!visited[i]){
			dfs(i);
		}
	}
}

void bfs(int v){
	visited[v] = 1;
	cout<<v<<' ';
	q.push(v);
	
	while(q.size()){
		int x = q.front();
		q.pop();
		
		for(int i=0;i<=n;i++){
			if(arr[x][i]==1&&!visited[i]){
				cout<<i<<' ';
				visited[i]=1;
				q.push(i);
			}
		}
	}
}



int main(){
	cin>>n>>m>>v;
	for(int i=0;i<m;i++){
		cin>>a>>b;
		arr[a][b] = 1;
		arr[b][a] =1;
	}
	
	dfs(v);
	cout<<'\n';
	fill(&visited[0],&visited[0]+1004,0);
	bfs(v);
}