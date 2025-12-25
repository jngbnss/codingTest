// I MEET P COUNT++ ELSE TT X CANT
#include<bits/stdc++.h>
using namespace std;
const int mx = 604;
char arr[mx][mx];
int visited[mx][mx];
int n,m,ret,sy,sx;
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};

void go(int y,int x){
	visited[y][x] = 1;
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=m) continue;
		if(arr[ny][nx] =='X') continue;
		if(!visited[ny][nx]){
			if(arr[ny][nx] =='P') ret++;
			visited[ny][nx] =1;
			go(ny,nx);
		}
	}
}
int main(){
	string s;
	cin>>n>>m;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<m;j++){
			arr[i][j]  = s[j];
			if(arr[i][j] == 'I'){
				sy = i,sx = j;	
			}
		}
	}
	go(sy,sx); //dfs
	if(ret) cout<<ret;
	else cout<<"TT";
}