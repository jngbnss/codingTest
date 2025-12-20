#include<bits/stdc++.h>
using namespace std;
const int max_n =100004;
int n,a,b;
vector<int>arr[max_n];
int visited[max_n];

int ret[100004];

void dfs(int y){
	visited[y] = 1;
	for(auto i:arr[y]){
		if(visited[i]) continue;
		ret[i] = y;
		dfs(i);
	}
}

int main(){
	cin>>n;
	for(int i=0;i<n-1;i++){
		cin>>a>>b;
		arr[a].push_back(b);
		arr[b].push_back(a);
	}
	dfs(1);
	for(int i=2;i<=n;i++){
		cout<<ret[i]<<'\n';
	}
}