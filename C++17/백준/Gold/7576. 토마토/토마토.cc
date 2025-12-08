#include<bits/stdc++.h>
using namespace std;
int n,m,ret,y,x;
int arr[1020][1020],visited[1020][1020];
queue<pair<int,int>>q;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
vector<pair<int,int>>v;

void bfs(){
	
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny = y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||ny>=n||nx<0||nx>=m||arr[ny][nx]==-1) continue;
			if(!visited[ny][nx]&&arr[ny][nx]==0){
				visited[ny][nx] = visited[y][x] +1;
				q.push({ny,nx});
			}
		}
	}
}
			

int main(){
	cin>>m>>n;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>arr[i][j];
			if(arr[i][j]==1){
				v.push_back({i,j});
			}else if(arr[i][j]==-1){
				visited[i][j] =-1;
			}
		}
	}
	
	for(int i=0;i<v.size();i++){
		q.push({v[i].first,v[i].second});
		visited[v[i].first][v[i].second] = 1;
	}
	bfs();
	//cout<<"===============\n";
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			//cout<<visited[i][j]<<' ';
			if(visited[i][j]==0){
				cout<<-1;
				return 0;
			}ret = max(ret,visited[i][j]);
			
		}//cout<<'\n';
	}
	cout<<ret-1;
}
	
