#include<bits/stdc++.h>
using namespace std;
const int mx = 100004;
int n,m,r;
int visited[mx];
int cnt =1;
vector<int>v[mx];
void dfs(int r){
	visited[r] = cnt++;
	
	sort(v[r].rbegin(),v[r].rend());
	
	for(auto i:v[r]){
		if(!visited[i]){
			visited[i] = cnt;
			dfs(i);
		}
	}
}
	
int main(){
	cin>>n>>m>>r;
	
	
	for(int i=0;i<m;i++){
		int a,b;
		cin>>a>>b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	dfs(r);
	for(int i =1;i<=n;i++){
		cout<<visited[i]<<'\n';
	}
}