#include<bits/stdc++.h>
using namespace std;
int n,m,k;
int arr[104][104],visited[104][104];
vector<int>v;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

int dfs(int y,int x){
	int cnt = 1;
	visited[y][x] =1;
	for(int i=0;i<4;i++){
		int ny=y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(!visited[ny][nx]&&arr[ny][nx] ==0){
			cnt+=dfs(ny,nx);
		}
	}
	return cnt;
}
	

int main(){
	cin>>n>>m>>k;
	for(int i=0;i<k;i++){
		int sx,sy,ex,ey;
		cin>>sx>>sy>>ex>>ey;
		for(int i=sy;i<ey;i++){
			for(int j=sx;j<ex;j++){
				arr[i][j] = 1;
			}
		}
	}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(arr[i][j]==0&&!visited[i][j]){
				v.push_back(dfs(i,j));
			}
		}
	}
	sort(v.begin(),v.end());
	cout<<v.size()<<'\n';
	for(auto i:v) cout<<i<<' ';
	
}
