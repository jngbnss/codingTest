#include<bits/stdc++.h>
using namespace std;
int n,t,ret,cnt,m,temp,y,x,k;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
int arr[55][55],visited[55][55];
void dfs(int y,int x){
	visited[y][x] =1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(arr[ny][nx]==1&&!visited[ny][nx]){
			dfs(ny,nx);
		}
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>t;
	while(t--){
		fill(&arr[0][0],&arr[0][0]+55*55,0);
		fill(&visited[0][0],&visited[0][0]+55*55,0);
		cnt =0;
		cin>>n>>m>>k;
		for(int i=0;i<k;i++){
			cin>>y>>x;
			arr[y][x] = 1;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i][j] ==1 &&!visited[i][j]){
					cnt++;
					dfs(i,j);
					
				}
			}
		}
		cout<<cnt<<'\n';
	}
}

