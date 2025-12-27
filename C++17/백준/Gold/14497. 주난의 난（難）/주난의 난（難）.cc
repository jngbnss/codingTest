#include<bits/stdc++.h>
using namespace std;
int n,m;
int sx,sy,ex,ey;
char arr[304][304];
int visited[304][304];
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
vector<pair<int,int>>v;
void dfs(int y,int x){
	visited[y][x] = 1;
	
	for(int i=0;i<4;i++){
		int ny= y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||nx<0||ny>=n||nx>=m) continue;
		
		
		if(!visited[ny][nx]&&(arr[ny][nx] =='0'||arr[ny][nx]=='#')){
			dfs(ny,nx);
		}else if(arr[ny][nx] =='1'){
			v.push_back({ny,nx});
		}
		
	}
}


int main(){
	cin>>n>>m;
	cin>>sy>>sx>>ey>>ex;
	sy--,sx--,ey--,ex--;
	
	string s;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j] = s[j];
		}
	}
	int cnt =0;
	int k =5;
	while(true){
		memset(visited,0,sizeof(visited));
		cnt++;
		dfs(sy,sx);
		for(auto i:v){
			arr[i.first][i.second]='0';
		}
		v.clear();
		if(visited[ey][ex]==1) break;
//		cout<<"show visited=======\n";
//		for(int i=0;i<n;i++){
//			for(int j=0;j<m;j++){
//				cout<<visited[i][j]<<' ';
//			}cout<<'\n';
//		}
	}
	cout<<cnt;
}