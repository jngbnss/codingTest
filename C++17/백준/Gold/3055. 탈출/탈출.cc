#include<bits/stdc++.h>
using namespace std;
const int max_n = 54;
int n,m,sy,sx,ey,ex,y,x;
char arr[max_n][max_n];
int visited[max_n][max_n],waterVisited[max_n][max_n];
vector<pair<int,int>>water;
queue<pair<int,int>>q;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

void bfsWater(int wy,int wx){
	waterVisited[wy][wx] = 1;
	q.push({wy,wx});
	
	while(q.size()){
		tie(y,x) = q.front();
		q.pop();
		
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx = x+dx[i];
			int nextTime = waterVisited[y][x]+1;
			if(ny<0||ny>=n||nx<0||nx>=m) continue;
			if(arr[ny][nx]=='D'||arr[ny][nx]=='X') continue;
			
			if(!waterVisited[ny][nx]||waterVisited[ny][nx]>nextTime){ // 
				waterVisited[ny][nx] = nextTime;
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
			int ny=y+dy[i];
			int nx = x+dx[i];
			int nextTime = visited[y][x]+1;
			if(ny<0||ny>=n||nx<0||nx>=m) continue;
			if(arr[ny][nx]=='X'||arr[ny][nx]=='*') continue;
			if(ny==ey&&nx==ex){//D
				visited[ny][nx] = nextTime;
				return ;
			}
			if(waterVisited[ny][nx]!=0&& waterVisited[ny][nx]<=nextTime) continue;
			if(!visited[ny][nx]){
				visited[ny][nx] = nextTime;
				q.push({ny,nx});
			}
			
		}
	}
}
	
	

int main(){
	cin>>n>>m;
	string s;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j] = s[j];
			if(arr[i][j]=='S'){ sy=i,sx=j;}
			if(arr[i][j]=='D'){ ey=i,ex=j;}
			if(arr[i][j]=='*'){	water.push_back({i,j});}
			
		}
	}
	
	
//	int wy,wx;
//	wy = v[0].first;
//	wx= v[0].second;
	for(auto i:water){
		bfsWater(i.first,i.second);
//		q.push({i.first,i.second});
	}
//	bfsWater(wy,wx);
	// waterVisited
	//
//	q.clear();
	queue<pair<int,int>>empty;
	swap(q,empty);
	
	bfs(sy,sx);//
//	cout<<"waterVisited\n";
//	for(int i=0;i<n;i++){
//		for(int j=0;j<m;j++){
//			cout<<waterVisited[i][j]<<' ';
//		}cout<<'\n';
//	}
//	
//	cout<<"visited\n";
//	for(int i=0;i<n;i++){
//		for(int j=0;j<m;j++){
//			cout<<visited[i][j]<<' ';
//		}cout<<'\n';
//	}
	//
	if(visited[ey][ex]!=0) cout<<visited[ey][ex]-1;
	else cout<<"KAKTUS";
}
	
