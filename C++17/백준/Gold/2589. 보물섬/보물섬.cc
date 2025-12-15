#include<bits/stdc++.h>
using namespace std;
int n,m;
char arr[54][54];
int visited[54][54];
int ret = -1;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
string s;
queue<pair<int,int>>q;

int bfs(int y,int x){
	visited[y][x] = 1;
	int ret = 1;
	q.push({y,x});
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny = y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||ny>n||nx<0||nx>=m) continue;
			if(arr[ny][nx] =='L'&&!visited[ny][nx]){
				visited[ny][nx] = visited[y][x]+1;
				ret = max(ret,visited[ny][nx]);
				q.push({ny,nx});
			}
		}
	}
	return ret;
}
				
	
	
	
	
	
int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j] = s[j];
		}
	}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(arr[i][j]=='L'){
				fill(&visited[0][0],&visited[0][0]+54*54,0);
				ret = max(ret,bfs(i,j));
			}
		}
	}
	
//	for(int i=0;i<n;i++){
//		for(int j=0;j<m;j++){
//			cout<<visited[i][j]<<' ';
//		}cout<<'\n';
//	}
	cout<<ret-1;
}
				