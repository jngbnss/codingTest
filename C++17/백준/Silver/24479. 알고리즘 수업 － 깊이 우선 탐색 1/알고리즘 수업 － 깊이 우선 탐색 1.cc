#include<bits/stdc++.h>
using namespace std;
const int max_n = 100004;

int n,m,r,cnt=1;
int a,b;
vector<int>arr[max_n];
int visited[max_n];

void dfs(int r){
	visited[r] = cnt++;
	
	for(auto i:arr[r]){
		if(!visited[i]){
			dfs(i);
		}
	}
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(0);cout.tie(0);
	cin>>n>>m>>r;
	for(int i=0;i<m;i++){
		cin>>a>>b;
		arr[a].push_back(b);
		arr[b].push_back(a);
	}
	for(int i=1;i<=n;i++){
		sort(arr[i].begin(),arr[i].end());
	}
	dfs(r);
	for(int i =1;i<=n;i++){
		cout<<visited[i]<<'\n';
	}
}