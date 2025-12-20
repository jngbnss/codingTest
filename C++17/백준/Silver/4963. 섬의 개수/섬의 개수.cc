//대각선 연결된 컴포넌트 초기화 계속 해주고
#include<bits/stdc++.h>
using namespace std;
const int max_n = 54;
int n,m;
int arr[max_n][max_n],visited[max_n][max_n];
int cnt;
int dy[]={-1,-1,-1,0,1,1,1,0},dx[]={-1,0,1,1,1,0,-1,-1};//8

void dfs(int y,int x){
	visited[y][x] = 1;
	for(int i=0;i<8;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(!visited[ny][nx] && arr[ny][nx] ==1){
			dfs(ny,nx);
		}
	}
}
int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	
	while(true){
		cin>>m>>n;
		if(m==0&&n==0) return 0;
		memset(arr,0,sizeof(arr));
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				cin>>arr[i][j];
			}
		}
		memset(visited,0,sizeof(visited));
		cnt =0;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i][j] ==1&&!visited[i][j]){
					cnt++;
					dfs(i,j);
				}
			}
		}
		cout<<cnt<<'\n';
	}
}