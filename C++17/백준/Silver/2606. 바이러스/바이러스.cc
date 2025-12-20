#include<bits/stdc++.h>
using namespace std;
int n,k,a,b,ret;
vector<int>arr[104];
int visited[104];
int dfs(int start){
	visited[start] = 1;
	int cnt = 1;

	for(auto i:arr[start]){
		if(visited[i]) continue;
		cnt+=dfs(i);
	}
	return cnt;
}
	
int main(){
	cin>>n>>k;
	for(int i=0;i<k;i++){
		cin>>a>>b;
		arr[a].push_back(b);
		arr[b].push_back(a);
	}

	cout<<dfs(1)-1;
//	cout<<ret;
}