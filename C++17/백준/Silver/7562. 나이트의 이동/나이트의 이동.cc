#include<bits/stdc++.h>
using namespace std;
const int mx = 304;
int t,n,a,b,c,d;
int arr[mx][mx],visited[mx][mx];
queue<pair<int,int>>q;
int dy[]={-1,-2,-2,-1,1,2,2,1};
int dx[]={-2,-1,1,2,2,1,-1,-2};

void bfs(int y,int x){
	visited[y][x] = 1;
	q.push({y,x});
	
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<8;i++){
			int ny= y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||nx<0||ny>=n||nx>=n) continue;
			if(!visited[ny][nx]){
				visited[ny][nx] = visited[y][x]+1;
				q.push({ny,nx});
			}
		}
	}
}
int main(){
	cin>>t;
	while(t--){
		memset(visited,0,sizeof(visited));
		cin>>n;
		cin>>a>>b>>c>>d;
		bfs(a,b);
		cout<<visited[c][d]-1<<'\n';
	}
}