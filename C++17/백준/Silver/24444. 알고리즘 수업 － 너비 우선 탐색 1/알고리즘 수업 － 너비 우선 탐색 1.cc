#include<bits/stdc++.h>
using namespace std;
int n,m,r;
const int max_n = 100004;

int a,b;
vector<int>v[max_n];
int visited[max_n];
queue<int>q;
int cnt = 1;
void bfs(int x){
	visited[x] = cnt++;
	q.push(x);
	while(q.size()){
		int x = q.front();
		q.pop();
		sort(v[x].begin(),v[x].end());
		for(auto i:v[x]){
			if(!visited[i]){
				visited[i] = cnt++;
				q.push(i);
			}
		}
	}
}

int main(){
	cin>>n>>m>>r;
	for(int i=0;i<m;i++){
		cin>>a>>b;
		v[a].push_back(b);
		v[b].push_back(a);
	}
	bfs(r);
	for(int i=1;i<=n;i++){
		cout<<visited[i]<<'\n';
	}
}