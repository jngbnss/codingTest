#include<bits/stdc++.h>
using namespace std;
int n,m,cnt;
vector<int>v;
int arr[104][104],visited[104][104];
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

int dfs(int y,int x){
	int cnt =0;
	visited[y][x] = 1;
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(arr[ny][nx] ==1){
			cnt++;
			visited[ny][nx] = 1;
			arr[ny][nx] = 0;
		}
		if(arr[ny][nx] == 0&&!visited[ny][nx]){
			cnt+= dfs(ny,nx);
		}
	}
	return cnt;
}
	


int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>arr[i][j];
		}
	}
	
	while(true){
		fill(&visited[0][0],&visited[0][0]+104*104,0);
		int ret = dfs(0,0);
		if(ret==0) break;
		v.push_back(ret);
	}
	if(v.size()==0){ cout<<0<<'\n'<<0;}
	cout<<v.size()<<'\n'<<v[v.size()-1];
}		