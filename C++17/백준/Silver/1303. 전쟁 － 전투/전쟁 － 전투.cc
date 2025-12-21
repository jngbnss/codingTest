#include<bits/stdc++.h>
using namespace std;
long long n,m,ret;
const int mx = 104;
char arr[mx][mx];
int visited[mx][mx];

int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
string s;

int dfs(int y,int x,char c){
	int cnt =1;
	visited[y][x] = 1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||nx<0||ny>=n||nx>=m) continue;
		if(!visited[ny][nx]&&arr[ny][nx] == c)
			cnt+=dfs(ny,nx,c);
		}
	
	return cnt;
}

int main(){
	cin>>m>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j] = s[j];
		}
	}
	long long w=0,b=0;
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(arr[i][j]=='W'&&!visited[i][j]){
				ret = dfs(i,j,'W');
//				cout<<ret<<'\n';
				w+=(ret*ret);
				ret =0;
			}
			if(arr[i][j]=='B'&&!visited[i][j]){
				ret = dfs(i,j,'B');
//				cout<<ret<<'\n';
				b+=(ret*ret);
				ret =0;
			}
		}
	}
	cout<<w<<' '<<b;
}
		