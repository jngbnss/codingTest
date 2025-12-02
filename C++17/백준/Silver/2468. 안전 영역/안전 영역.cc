#include<bits/stdc++.h>
using namespace std;
int n,m,temp,ret=1,mx;
int arr[104][104],visited[104][104];
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

void dfs(int y,int x,int height){
	visited[y][x] = 1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		if(ny<0||ny>=n||nx<0||nx>=n) continue;
		if(arr[ny][nx]>height&&!visited[ny][nx]){
			dfs(ny,nx,height);
		}
	}
}
	
	

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin>>arr[i][j];
			mx = max(mx,arr[i][j]);
		}
	}
	
	
	for(int h=0;h<=mx;h++){
		fill(&visited[0][0],&visited[0][0]+104*104,0);
		int cnt =0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[i][j]>h&&!visited[i][j]){
					cnt++;
					dfs(i,j,h);
				}
			}
		}
//		cout<<h<<" : "<<cnt<<'\n';
//		if(h==3){
//			for(int i=0;i<n;i++){
//				for(int j=0;j<n;j++){
//					cout<<visited[i][j];
//				}cout<<'\n';
//			}
//		}
		ret = max(ret,cnt);
	}
	
	cout<<ret;
}
		