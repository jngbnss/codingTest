#include<bits/stdc++.h>
using namespace std;
int n,m,ret;
const int max_n = 504;
int arr[max_n][max_n],visited[max_n][max_n];

int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
vector<int>v;

int dfs(int y,int x){
	visited[y][x] = 1;
	
	int cnt = 1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(!visited[ny][nx] && arr[ny][nx] ){
			cnt += dfs(ny,nx);
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
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(!visited[i][j]&&arr[i][j] ==1){
				ret = dfs(i,j);
				v.push_back(ret);
			}
		}
	}
	
	if(v.size()==0){
		cout<<0<<'\n';
		cout<<0;
		return 0;
	}
	
	sort(v.begin(),v.end());
	cout<<v.size()<<'\n'<<v[v.size()-1];
}