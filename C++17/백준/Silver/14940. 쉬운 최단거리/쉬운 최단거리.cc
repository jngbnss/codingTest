#include<bits/stdc++.h>
using namespace std;
const int mx = 1304;
int t,n,a,b,c,d,m;
int arr[mx][mx],visited[mx][mx];
queue<pair<int,int>>q;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

void bfs(int y,int x){
	visited[y][x] = 1;
	q.push({y,x});
	
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny= y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||nx<0||ny>=n||nx>=m||arr[ny][nx]==0) continue;
			if(!visited[ny][nx]&&arr[ny][nx]==1){
				visited[ny][nx] = visited[y][x]+1;
				q.push({ny,nx});
			}
		}
	}
}
int main(){
	int sy,sx;
	cin>>n>>m;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>arr[i][j];
			if(arr[i][j] ==2){
			 	sy = i;
				 sx = j;
			}
		}
	}
	bfs(sy,sx);
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(arr[i][j]==1&&visited[i][j]==0) cout<<-1<<' ';
			else if(visited[i][j]==0) cout<<0<<' ';
			else cout<<visited[i][j]-1<<' ';
		}cout<<'\n';
	}
}