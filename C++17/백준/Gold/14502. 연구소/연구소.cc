#include<bits/stdc++.h>
using namespace std;
int n,m,ret;
int arr[10][10],visited[10][10];
vector<pair<int,int>>v,wallList,virusList;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};


void dfs(int y,int x){
	// spread virus by checking visited
	visited[y][x] = 1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(arr[ny][nx] ==1 ) continue;
		if(!visited[ny][nx]&&arr[ny][nx] ==0){
			dfs(ny,nx);
		}
	}
}
		

int go(){
	for(auto v:virusList){
		dfs(v.first,v.second);
	}
	int ret = 0;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(arr[i][j]==0&&!visited[i][j]) ret++;
		}
	}
	return ret;
}
		
	

int main(){
	cin>>n>>m;
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cin>>arr[i][j];
			if(arr[i][j]==0){
				wallList.push_back({i,j});
			}
			else if(arr[i][j] ==2){
				virusList.push_back({i,j});
			}
		}
	}
	
	for(int i=0;i<wallList.size();i++){
		for(int j=0;j<i;j++){
			for(int k=0;k<j;k++){
            arr[wallList[i].first][wallList[i].second] = 1;
            arr[wallList[j].first][wallList[j].second] = 1;
            arr[wallList[k].first][wallList[k].second] = 1;
            fill(&visited[0][0],&visited[0][0]+10*10,0);
            ret = max(ret,go());
            arr[wallList[i].first][wallList[i].second] = 0;
            arr[wallList[j].first][wallList[j].second] = 0;
            arr[wallList[k].first][wallList[k].second] = 0;
	        }
	    }
	}
	cout<<ret; 
}