#include<bits/stdc++.h>
using namespace std;
int n,m,ret,a,b,mx;

const int max_n = 100004;

vector<int>arr[max_n];
//int arr[max_n][max_n],
int visited[max_n];

int dy[]={-1,0,1,0},dx[]={0,-1,0,1};
vector<int>v;

int dfs(int y){
	visited[y]= 1;
	
	int cnt = 1;
	
	for(auto i:arr[y]){
		if(!visited[i]){
			cnt += dfs(i);
		}
	}
	return cnt;
}

int main(){
	cin>>n>>m;
	for(int i=0;i<m;i++){
		cin>>a>>b;
//		arr[a].push_back(b);
		arr[b].push_back(a);
	}
	for(int i=1;i<=n;i++){
		memset(visited,0,sizeof(visited));
		ret = dfs(i);
//		cout<<i<<" : "<<ret<<'\n';
		mx = max(mx,ret);
		v.push_back(ret);
	}
	for(int i=0;i<=n;i++){
		if(v[i]==mx) cout<<i+1<<' ';
	}
		
}