#include<bits/stdc++.h>
using namespace std;
int n,m;
vector<int>arr[1004];
int visited[1004];
int a,b;
int cnt;

void dfs(int y){
	visited[y] = 1;
	
	for(auto i:arr[y]){
		if(!visited[i]){
			dfs(i);
		}
	}
}

int main(){
	cin>>n>>m;
	for(int i=0;i<m;i++){
		cin>>a>>b;
		arr[a].push_back(b);
		arr[b].push_back(a);
	}
	for(int i=1;i<=n;i++){
		if(!visited[i]){
			cnt++;
			dfs(i);
		}
	}
	cout<<cnt;
}