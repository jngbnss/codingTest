#include<bits/stdc++.h>
using namespace std;
int n,m,sy,sx,ret,y,x;
const int mx =  1004;
char arr[mx][mx];
int visited[mx][mx],fire[mx][mx];
vector<pair<int,int>>f;
queue<pair<int,int>>q;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

void gofire(){
	for(auto i:f){
		fire[i.first][i.second] = 1;
		q.push({y,x});
	}
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny = y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||ny>=n||nx<0||nx>=m) continue;
			if(fire[ny][nx]>fire[y][x]+1) fire[ny][nx] = fire[y][x]+1;
			if(!fire[ny][nx]&&arr[ny][nx] !='#'){
				fire[ny][nx] = fire[y][x]+1;
				q.push({ny,nx});
			}
		}
	}	
}
void bfs(int y,int x){
	visited[y][x] = 1;
	q.push({y,x});
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny = y+dy[i];
			int nx = x+dx[i];
			
			if(ny==-1||ny==n||nx==-1||nx==m){
				ret = visited[y][x]+1;
				return ;
			}
			
			if(ny<0||ny>=n||nx<0||nx>=m) continue;
			if(fire[ny][nx]<=visited[y][x]+1) continue;
			if(!visited[ny][nx]&&arr[ny][nx] =='.'){
				visited[ny][nx] = visited[y][x]+1;
				q.push({ny,nx});
			}
		}
	}	
}

int main(){
	cin>>n>>m;
	fill(&fire[0][0],&fire[0][0]+mx*mx,mx);
	string s;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j] = s[j];
			if(arr[i][j] =='J'){
				sy = i,sx = j;
			}else if(arr[i][j]=='F'){
				f.push_back({i,j});
				fire[i][j] = 1;//
			}
		}
	}
//	gofire();
	/////
	for(auto i:f){
		fire[i.first][i.second] = 1;
		q.push({i.first,i.second});
	}
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny = y+dy[i];
			int nx = x+dx[i];
			
			if(ny<0||ny>=n||nx<0||nx>=m) continue;
			
//			if(fire[ny][nx]>fire[y][x]+1) 
//			fire[ny][nx] = fire[y][x]+1;
			
			if(fire[ny][nx]==mx&&arr[ny][nx] !='#'){
				fire[ny][nx] = fire[y][x]+1;
				q.push({ny,nx});
			}
		}
	}
	/////
	
//	for(auto i:f){
//		gofire(i.first,i.second);
//	}

//	for(int i=0;i<n;i++){
//		for(int j=0;j<m;j++){
//			cout<<fire[i][j]<<' ';
//		}cout<<'\n';
//	}

	bfs(sy,sx);
	//////////
//	cout<<"/////////////////////\n";
//	for(int i=0;i<n;i++){
//		for(int j=0;j<m;j++){
//			cout<<visited[i][j]<<' ';
//		}cout<<'\n';
//	}
//	
	if(ret) cout<<ret-1;
	else cout<<"IMPOSSIBLE";
}

