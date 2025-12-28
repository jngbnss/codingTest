#include<bits/stdc++.h>
using namespace std;
int n,temp,m,ret;
int root;
int visited[55];
vector<int>v[55];
void dfs(int now){
	bool check = true;
	visited[now] = 1;
//	if(now==m) return;
	for(auto i:v[now]){
		if(i==m) continue;
		check = false;
		if(!visited[i]){
			dfs(i);
		}
	}
	if(check) ret++;
}
int main(){
	cin>>n;
//	int visited[n];
//	memset(visited,0,sizeof(visited));
	
	for(int i=0;i<n;i++){
		cin>>temp;
		if(temp==-1) root=i;
		else v[temp].push_back(i);
	}
	
	cin>>m;
	if(m==root){
		cout<<0;
		return 0;
	}
	dfs(root);
	cout<<ret;
}