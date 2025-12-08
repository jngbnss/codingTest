#include<bits/stdc++.h>
using namespace std;
int n,m,ret,y,x,cnt;
char arr[104][104];
int visited[104][104];
int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
vector<pair<int,int>>v;
string s;

void dfs(int y,int x){
	visited[y][x] = 1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=n) continue;
		if(!visited[ny][nx]&&arr[ny][nx]==arr[y][x]){
			dfs(ny,nx);
		}
	}
}

void dfs1(int y,int x){
	visited[y][x] = 1;
	
	for(int i=0;i<4;i++){
		int ny = y+dy[i];
		int nx = x+dx[i];
		
		if(ny<0||ny>=n||nx<0||nx>=n) continue;
		if(!visited[ny][nx]&&(arr[ny][nx]=='R'||arr[ny][nx]=='G')){
			dfs1(ny,nx);
		}
	}
}
			

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n;
	for(int i=0;i<n;i++){
		cin>>s;
		for(int j=0;j<n;j++){
			arr[i][j] = s[j];
		}
	}
	
	fill(&visited[0][0],&visited[0][0]+104*104,0);
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(!visited[i][j]){
				if(arr[i][j]=='R'){
					cnt++;
					dfs(i,j);
				}else if(arr[i][j]=='G'){
					cnt++;
					dfs(i,j);
				}
				else if(arr[i][j]=='B'){
					cnt++;
					dfs(i,j);
				}
			}
		}
	}
	cout<<cnt<<' ';
	cnt =0;
	fill(&visited[0][0],&visited[0][0]+104*104,0);
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(!visited[i][j]){
				if(arr[i][j]=='R'||arr[i][j]=='G'){
					cnt++;
					dfs1(i,j);
				}
				else if(arr[i][j]=='B'){
					cnt++;
					dfs(i,j);
				}
			}
		}
	}
	cout<<cnt;
			
}
	
