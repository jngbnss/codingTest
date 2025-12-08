#include<bits/stdc++.h>
using namespace std;
int n,m,ret,cnt;
string s;
char arr[30][30];
int visited[30][30];
vector<int>v;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

int dfs(int y,int x){
	visited[y][x] = 1;
	int cnt = 1;
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=n) continue;
		if(!visited[ny][nx]&&arr[ny][nx]=='1'){
			cnt+=dfs(ny,nx);
		}
	}
	return cnt;
}

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<n;j++){
			arr[i][j] = s[j];
		}
	}
	
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(arr[i][j] =='1'&&!visited[i][j]){
				cnt = dfs(i,j);
				v.push_back(cnt);
				//cout<<cnt<<'\n';
			}
		}
	}
	sort(v.begin(),v.end());
	cout<<v.size()<<'\n';
	for(auto i:v){cout<<i<<'\n';}
	
//	for(int i=0;i<n;i++){
//		for(int j=0;j<n;j++){
//			cout<<visited[i][j]<<' ';
//		}cout<<'\n';
//	}
}
	